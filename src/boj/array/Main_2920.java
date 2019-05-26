package boj.array;

/*
    링크 : https://www.acmicpc.net/problem/2920
    유형 : 배열
    문제 이름 : 음계
 */

import java.util.Scanner;

public class Main_2920 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ascending = "12345678";
        String descending = "87654321";
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < 8; i++) {
            sb.append(scanner.nextInt());
        }

        String str = sb.toString();
        String ans = "mixed";
        if (str.equals(ascending)) {
            ans = "ascending";
        } else if (str.equals(descending)) {
            ans = "descending";
        }

        System.out.println(ans);
        scanner.close();
    }
}
