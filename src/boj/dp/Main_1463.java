package boj.dp;

/*
    링크 : https://www.acmicpc.net/problem/1463
    유형 : 다이나믹 프로그래밍
    문제 이름 : 1로 만들기
 */

import java.util.Scanner;

public class Main_1463 {
    public static void main(String[] args) {
        int[] d = new int[1000001];
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Bottom-up way
        d[1] = 0;
        for (int i = 2; i <= n; i++) {
            d[i] = d[i - 1] + 1;

            if (i % 3 == 0) {
                int temp = d[i / 3] + 1;
                if (d[i] > temp) d[i] = temp;
            }

            if (i % 2 == 0) {
                int temp = d[i / 2] + 1;
                if (d[i] > temp) d[i] = temp;
            }
        }

        System.out.println(d[n]);
    }
}