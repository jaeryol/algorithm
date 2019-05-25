package boj.dp;

/*
    링크 : https://www.acmicpc.net/problem/2579
    유형 : 다이나믹 프로그래밍
    문제 이름 : 계단 오르기
 */

import java.util.Scanner;

public class Main_2579 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
        }

        int[][] d = new int[n + 1][3];
        d[1][1] = a[1];
        for (int i = 2; i <= n; i++) {
            d[i][1] = Math.max(d[i - 2][1], d[i - 2][2]) + a[i];
            d[i][2] = d[i - 1][1] + a[i];
        }
        System.out.println(Math.max(d[n][1], d[n][2]));

        scanner.close();
    }
}
