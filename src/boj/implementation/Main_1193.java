package boj.implementation;

/*
    링크 : https://www.acmicpc.net/problem/1193
    유형 : 구현(규칙 찾기)
    문제 이름 : 분수 찾기
 */

import java.util.Scanner;

public class Main_1193 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int start = 1;
        int sum = 0;
        while (true) {
            sum += start;
            if (sum >= n) {
                break;
            }
            start++;
        }

        if (start % 2 != 0) {
            sum = sum - start + 1;
        }

        int j = 1;
        for (int i  = start ; i > 0; i--) {
            if (sum == n) {
                System.out.println(i + "/" + j);
            }
            if (start % 2 == 0) {
                sum--;
            } else {
                sum++;
            }
            j++;
        }

        scanner.close();
    }
}
