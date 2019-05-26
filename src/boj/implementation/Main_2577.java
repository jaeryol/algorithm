package boj.implementation;

/*
    링크 : https://www.acmicpc.net/problem/2577
    유형 : 구현
    문제 이름 : 숫자의 개수
 */

import java.util.Scanner;

public class Main_2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        String s = Integer.toString(a * b * c);
        int length = s.length();

        int[] arr = new int[10];
        for (int i = 0; i < length; i++) {
            int index = s.charAt(i) - '0';
            arr[index] += 1;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }

        scanner.close();
    }
}
