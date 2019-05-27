package boj.implementation;

/*
    링크 : https://www.acmicpc.net/problem/2292
    유형 : 구현
    문제 이름 : 벌집
 */

import java.util.Scanner;

public class Main_2292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int current = 1;
        int ans = 1;
        while (true) {
            if (current >= n || n == 1) {
                break;
            }

            current += 6 * ans;
            ans++;
        }

        System.out.println(ans);
        scanner.close();
    }
}
