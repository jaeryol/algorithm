package boj.iteration;

/*
    링크 : https://www.acmicpc.net/problem/1110
    유형 : 반복문
    문제 이름 : 더하기 사이클
 */

import java.util.Scanner;

public class Main_1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int source = scanner.nextInt();
        int dividend = source;
        int count = 0;

        while (true) {
            count++;

            int quotient = dividend / 10;
            int remainder = dividend % 10;
            int sum = quotient + remainder;
            int remainderOfSum = (sum % 10);

            String temp = remainder + "" + remainderOfSum;
            dividend = Integer.valueOf(temp);
            if (dividend == source) {
                break;
            }
        }

        System.out.println(count);
        scanner.close();
    }
}
