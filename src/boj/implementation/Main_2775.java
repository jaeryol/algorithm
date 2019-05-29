package boj.implementation;

/*
    링크 : https://www.acmicpc.net/problem/2775
    유형 : 구현(규칙 찾기)
    문제 이름 : 부녀회장이 될테야
 */

import java.util.Scanner;

public class Main_2775 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] apt = new int[15][15];

        for (int i = 1; i < 15; i++) {
            apt[0][i] = i;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
            }
        }

        int r = scanner.nextInt();
        while (r-- > 0) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();

            System.out.println(apt[k][n]);
        }

        scanner.close();
    }
}

