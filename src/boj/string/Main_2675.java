package boj.string;

/*
    링크 : https://www.acmicpc.net/problem/2675
    유형 : 문자열 처리
    문제 이름 : 문자열 반복
 */

import java.util.Scanner;

public class Main_2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        while (r-- > 0) {
            String[] splits = scanner.nextLine().split(" ");
            String s = splits[1];
            int v = Integer.valueOf(splits[0]);

            int length = s.length();
            for (int i = 0; i < length; i++) {
                char c = s.charAt(i);
                for (int j = 0; j < v; j++) {
                    sb.append(c);
                }
            }

            System.out.println(sb);
            sb.setLength(0);
        }

        scanner.close();
    }
}
