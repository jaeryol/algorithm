package boj.graph;

/*
    링크 : https://www.acmicpc.net/problem/2178
    유형 : 그래프
    문제 이름: 미로 탐색

    bfs 활용해 문제 풀이
 */


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_2178 {
    public static int[][] d;
    public static int[] dx = new int[] { 0, 0, 1, -1};
    public static int[] dy = new int[] { 1, -1, 0, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        d = new int[n][m];
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < m; j++) {
                d[i][j] = line.charAt(j) - '0';
            }
        }

        int[][] g = new int[n][m];
        bfs(g, 0, 0, n, m);

        System.out.println(g[n - 1][m - 1]);
    }

    public static void bfs(int[][] g, int i, int j, int n, int m) {
        Queue<Pair> q = new LinkedList();
        g[i][j] = 1;
        q.offer(new Pair(i, j));

        while (q.isEmpty() == false) {
            Pair p = q.poll();
            for (int a = 0 ; a < 4; a++) {
                int x = p.x + dx[a];
                int y = p.y + dy[a];

                if (x >= 0 && x < n && y >= 0 && y < m) {
                    if (d[x][y] == 1 && g[x][y] == 0) {
                        g[x][y] = g[p.x][p.y] + 1;
                        q.offer(new Pair(x, y));
                    }
                }
            }
        }
    }

    public static class Pair {
        private int x;
        private int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
