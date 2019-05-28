package boj.implementation;

/*
    링크 : https://www.acmicpc.net/problem/10250
    유형 : 구현(규칙 찾기)
    문제 이름 : ACM 호텔
 */

import java.util.Scanner;

public class Main_10250 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        while (r-- > 0) {
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            int n = scanner.nextInt();

            int a = n / h;
            int b = n % h;

            // 꼭대기 층일 경우 처리 하기
            if (n % h == 0) {
                b = h;
            } else {
                a += 1;
            }

            // 호수가 한 자리 수 또는 두 자리 수인지 확인
            if (a / 10 > 0) {
                System.out.println(b + "" + a);
            } else {
                System.out.println(b + "0" + a);
            }
        }
        scanner.close();
    }
}
