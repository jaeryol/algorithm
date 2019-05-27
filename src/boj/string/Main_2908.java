package boj.string;

/*
    링크 : https://www.acmicpc.net/problem/2908
    유형 : 문자열 처리
    문제 이름 : 상수
 */

import java.util.Scanner;

public class Main_2908 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v1 = reverse(scanner.nextInt());
        int v2 = reverse(scanner.nextInt());

        int ans =  v1 > v2 ? v1 : v2;
        System.out.println(ans);

        scanner.close();
    }


    public static int reverse(int value) {
        int a = value / 100;
        int b = (value % 100) / 10;
        int c = (value % 100) % 10;

        int result = c * 100 + b * 10 + a * 1;
        return result;
    }
}