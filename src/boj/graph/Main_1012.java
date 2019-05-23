package boj.graph;

/*
    링크 : https://www.acmicpc.net/problem/1012
    유형 : 그래프
    문제 이름 : 유기농 배추

    dfs로 해결, bfs로도 해결 가능
 */

import java.util.Scanner;

public class Main_1012 {
    public static int[][] d;
    public static int[] dx = new int[]{ 0, 0, 1, -1};
    public static int[] dy = new int[]{ 1, -1, 0, 0};

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // test case count
        int repeat = scanner.nextInt();
        while (repeat-- > 0) {
            // 배추밭 가로
            int m = scanner.nextInt();
            // 배추밭 세로
            int n = scanner.nextInt();
            // 배추 위치의 개수
            int k = scanner.nextInt();

            d = new int[n][m];
            for (int i = 0; i < k; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                d[y][x] = 1;
            }

            int[][] g = new int[n][m];
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (d[i][j] == 1 && g[i][j] == 0) {
                        dfs(g, i, j, ++cnt, n, m);
                    }
                }
            }

            System.out.println(cnt);
        }
    }

    public static void dfs(int[][] g, int i, int j, int cnt, int n, int m) {
        g[i][j] = cnt;
        for (int a = 0; a < 4; a++) {
            int x = i + dx[a];
            int y = j + dy[a];

            if (x >= 0 && x < n && y >=0 && y < m) {
                if (d[x][y] == 1 && g[x][y] == 0) {
                    dfs(g, x, y, cnt, n, m);
                }
            }
        }
    }
}
