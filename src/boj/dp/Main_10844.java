package boj.dp;

/*
    링크 : https://www.acmicpc.net/problem/10844
    유형 : 다이나믹 프로그래밍
    문제 이름 : 쉬운 계단 수
 */

import java.util.Scanner;

public class Main_10844 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[][] D = new long[N + 1][10];
        for (int i = 1; i <= 9; i++) {
            D[1][i] = 1;
        }

        for (int i = 2; i <= N; i++) {
            D[i][0] = D[i - 1][1];
            for (int j = 1; j <= 9; j++) {
                if (j == 9) {
                    D[i][j] = (D[i - 1][j - 1]) % 1000000000;
                } else {
                    D[i][j] = (D[i - 1][j - 1] + D[i - 1][j + 1]) % 1000000000;
                }
            }
        }

        long ans = 0;
        for (int i = 0; i <= 9; i++) {
            ans += D[N][i];
            System.out.println("ans > " + ans);
        }

        System.out.println(ans % 1000000000);
        scanner.close();
    }
}
