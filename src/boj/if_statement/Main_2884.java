package boj.if_statement;

/*
    링크 : https://www.acmicpc.net/problem/2884
    유형 : if 문
    문제 이름 : 알람 시계
 */

import java.util.Scanner;

public class Main_2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        if (validateHourAndMin(hour, min)) {
            return;
        }

        int sumOfMin = switchFromHourToMin(hour) + min;
        int resultMin = sumOfMin - 45;
        System.out.print((resultMin / 60) + " " + (resultMin % 60));

        scanner.close();
    }

    private static boolean validateHourAndMin(int hour, int min) {
        if (validateHour(hour) &&
            validateMin(min)) {
            return true;
        }
        return false;
    }

    private static boolean validateHour(int hour) {
        if (hour < 0 || hour > 23) {
            return true;
        }
        return false;
    }

    private static boolean validateMin(int min) {
        if (min < 0 || min > 59) {
            return true;
        }
        return false;
    }

    private static int switchFromHourToMin(int hour) {
        if (hour == 0) {
            return 60 * 24;
        }
        return hour * 60;
    }
}
