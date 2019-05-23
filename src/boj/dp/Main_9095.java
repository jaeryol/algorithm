package boj.dp;

/*
    링크 : https://www.acmicpc.net/problem/9095
    유형 : 다이나믹 프로그래밍
    문제 이름 : 1, 2, 3 더하기
 */

import java.util.Scanner;

public class Main_9095 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] d = new int[11];
        d[0] = 1;

        for (int i = 1; i < 11; i++) {
            if (i - 1 >= 0) d[i] += d[i - 1];
            if (i - 2 >= 0) d[i] += d[i - 2];
            if (i - 3 >= 0) d[i] += d[i - 3];
        }

        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int index = scanner.nextInt();
            System.out.println(d[index]);
        }
    }
}