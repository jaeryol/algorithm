package boj.if_statement;

/*
    링크 : https://www.acmicpc.net/problem/2573
    유형 : if 문
    문제 이름 : 윤년
 */

import java.util.Scanner;

public class Main_2573 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        int result = calculateLeapYear(year);
        System.out.println(result);
        
        scanner.close();
    }

    private static int calculateLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) ||
                year % 400 == 0) {
            return 1;
        }

        return 0;
    }
}
