package boj.implementation;

/*
    링크 : https://www.acmicpc.net/problem/10039
    유형 : 구현
    문제 이름 : 평균 점수
 */

import java.util.Scanner;

public class Main_10039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
            int v = numbers[i];
            if (v < 40) {
                v = 40;
            }
            sum += v;
        }

        System.out.println(sum / 5);
    }
}
