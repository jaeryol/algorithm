package boj.dp;

/*
    링크 : https://www.acmicpc.net/problem/1003
    유형 : 다이나믹 프로그래밍
    문제 이름 : 피보나치 함수
 */

import java.util.Scanner;

public class Main_1003 {
    public static int[][] d = new int[41][2];

    public static void main(String[] args) {
        d[0][0] = 1;
        d[1][1] = 1;

        for (int i = 2; i < 41; i++) {
            for (int j = 0; j < 2; j++) {
                d[i][j] = d[i - 1][j] + d[i - 2][j];
            }
        }

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for (int i = 0; i < r; i++) {
            int n = sc.nextInt();
            System.out.println(d[n][0] + " " + d[n][1]);
        }
    }
}