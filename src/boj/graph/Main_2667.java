package boj.graph;

/*
    링크 : https://www.acmicpc.net/problem/2667
    유형 : 그래프
    문제 이름: 단지 번호 붙이기 문제

    dfs, bfs 두가지 활용해 문제 풀이
 */


import java.util.*;

public class Main_2667 {
    public static ArrayList<ArrayList<Integer>> d;
    public static boolean[] c;
    public static int[][] g;
    public static int[] dx = new int[] { 0, 0, 1, -1};
    public static int[] dy = new int[] { 1, -1, 0, 0};

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        d = new ArrayList(n);
        for (int i = 0; i < n; i++) {
            d.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < line.length(); j++) {
                d.get(i).add(line.charAt(j) - '0');
            }
        }

        g = new int[n][n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (d.get(i).get(j) == 1 && g[i][j] == 0) {
                    cnt+=1;
//                    dfs(g, i, j, n, cnt);
                    bfs(g, i, j, n , cnt);
                }
            }
        }

        int[] ans = new int[cnt];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (g[i][j] != 0) {
                    ans[g[i][j] - 1] += 1;
                }
            }
        }

        Arrays.sort(ans);

        System.out.println(cnt);
        for (int i = 0; i < cnt; i++) {
            System.out.println(ans[i]);
        }
    }

    public static void dfs(int[][] g, int i, int j, int n, int cnt) {
        g[i][j] = cnt;
        for (int a = 0; a < 4; a++) {
            int x = i + dx[a];
            int y = j + dy[a];

            if (x < n && x >= 0 && y < n && y >= 0) {
                if (d.get(x).get(y) == 1 && g[x][y] == 0) {
                    dfs(g, x, y, n, cnt);
                }
            }
        }
    }

    public static void bfs(int[][] g, int i , int j, int n, int cnt) {
        Queue<Pair> q = new LinkedList();

        q.offer(new Pair(i, j));
        g[i][j] = cnt;

        while (q.isEmpty() == false) {
            Pair pair = q.poll();
            for (int a = 0; a < 4; a++) {
                int x = pair.x + dx[a];
                int y = pair.y + dy[a];
                if (x < n && x >= 0 && y < n && y >= 0) {
                    if (d.get(x).get(y) == 1 && g[x][y] == 0) {
                        q.offer(new Pair(x, y));
                        g[x][y] = cnt;
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