package boj.string;

/*
    링크 : https://www.acmicpc.net/problem/1157
    유형 : 문자열 처리
    문제 이름 : 단어 공부
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main_1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();

        int[] a = new int[26];
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 97;
            a[index] += 1;

            if (a[max] < a[index]) {
                max = index;
            }
        }

        Arrays.sort(a);
        if (a[25] == a[24]) {
            System.out.println('?');
        } else {
            System.out.println(Character.toUpperCase((char)(max + 97)));
        }

        scanner.close();
    }
}
