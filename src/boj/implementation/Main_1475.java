package boj.implementation;

/*
    링크 : https://www.acmicpc.net/problem/1475
    유형 : 구현(규칙 찾기)
    문제 이름 : 방 번호
 */

import java.util.Scanner;

public class Main_1475 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        double[] d = new double[9];

        for (int i = 0; i < line.length(); i++) {
            int idx = line.charAt(i) - '0';

            if (idx == 6 || idx == 9) {
                d[6] += 0.5;
            } else {
                d[idx] += 1;
            }
        }

        double ans = 0;
        d[6] = Math.round(d[6]);
        for (int i = 0 ; i < 9; i++) {
            if (ans < d[i]) {
                ans = d[i];
            }
        }
        System.out.println((int)ans);
        scanner.close();
    }
}
