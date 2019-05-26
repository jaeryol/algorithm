package boj.implementation;

/*
    링크 : https://www.acmicpc.net/problem/8958
    유형 : 구현
    문제 이름 : OX 퀴즈
 */

import java.util.Scanner;

public class Main_8958 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int repeat = scanner.nextInt();
        scanner.nextLine();

        int[] ans = new int[repeat];
        for (int r = 0 ; r < repeat; r++) {
            String line = scanner.nextLine();
            int length = line.length();
            int[] a = new int[length];
            if (line.charAt(0) == 'O') {
                a[0] = 1;
            }
            ans[r] += a[0];

            for (int i = 1; i < length; i++) {
                if (line.charAt(i) == 'O') {
                    a[i] = 1;
                    a[i] += a[i - 1];
                }
                ans[r] += a[i];
            }
        }

        for (int i = 0; i < repeat; i++) {
            System.out.println(ans[i]);
        }
        scanner.close();
    }
}
