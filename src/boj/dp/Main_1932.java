package boj.dp;

/*
    링크 : https://www.acmicpc.net/problem/1932
    유형 : 다이나믹 프로그래밍
    문제 이름 : 정수 삼각형
 */

import java.util.Scanner;

public class Main_1932 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        int[][] d = new int[n][n];
        d[0][0] = a[0][0];
        int max = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    d[i][j] = d[i - 1][j] + a[i][j];
                } else {
                    d[i][j] = Math.max(d[i - 1][j - 1], d[i - 1][j]) + a[i][j];
                }

                if (d[i][j] > max){
                    max = d[i][j];
                }
            }
        }

        System.out.println(max);
    }
}
