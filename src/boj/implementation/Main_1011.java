package boj.implementation;

/*
    링크 : https://www.acmicpc.net/problem/1011
    유형 : 구현(규칙 찾기)
    문제 이름 : Fly me to the Alpha Centauri

    입력 값에 대한 자료형 범위를 신경 써야 한다. 그렇지 않으면 시간 초과 오류가 발생한다.
 */

import java.util.Scanner;

public class Main_1011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();

        while (r-- > 0) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int dist = end - start;
            long n = 1;
            while (true) {
                if (n * n >= dist){
                    break;
                }
                n++;
            }

            long ans = 0;
            if ((n * n) - n + 1 > dist) {
                ans = n * 2 - 2;
            } else {
                ans = n * 2 - 1;
            }

            System.out.println(ans);
        }
        scanner.close();
    }
}
