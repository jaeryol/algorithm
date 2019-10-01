package boj.output;

/*
    링크 : https://www.acmicpc.net/problem/2588
    유형 : 출력
    문제 이름 : 곱셈
 */

import java.util.Scanner;

public class Main_2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        String[] splits = String.valueOf(b).split("");
        for (int i = 2; i >= 0; i--) {
            System.out.println(a * Integer.parseInt(splits[i]));
        }
        System.out.println(a * b);

        scanner.close();
    }
}
