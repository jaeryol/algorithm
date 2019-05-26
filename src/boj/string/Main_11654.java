package boj.string;

/*
    링크 : https://www.acmicpc.net/problem/11654
    유형 : 문자열 처리
    문제 이름 : 아스키 코드
 */

import java.util.Scanner;

public class Main_11654 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ans = scanner.nextLine().charAt(0);
        System.out.println(ans);

        scanner.close();
    }
}
