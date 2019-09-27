package boj.array;

/*
    링크 : https://www.acmicpc.net/problem/2562
    유형 : 배열
    문제 이름 : 최댓값
 */

import java.util.Scanner;

public class Main_2562 {
    public static void main(String[] args) {
        int size = 9;
        int resultValue = 0;
        int resultIndex = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= size; i++) {
            int input = scanner.nextInt();
            if (input > resultValue) {
                resultValue = input;
                resultIndex = i;
            }
        }

        System.out.println(resultValue);
        System.out.println(resultIndex);

        scanner.close();
    }
}
