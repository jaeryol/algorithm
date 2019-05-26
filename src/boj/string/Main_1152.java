package boj.string;

/*
    링크 : https://www.acmicpc.net/problem/1152
    유형 : 문자열 처리
    문제 이름 : 단어의 개수
 */

import java.util.Scanner;

public class Main_1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] splits = scanner.nextLine().trim().split(" ");

        int length = splits.length;
        if (splits.length == 1 && splits[0].equals(""))
            length = 0;

        System.out.println(length);
    }
}
