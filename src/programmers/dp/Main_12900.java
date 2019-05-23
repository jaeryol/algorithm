package programmers.dp;

/*
    링크 : https://programmers.co.kr/learn/courses/30/lessons/12900
    유형 : 다이나믹 프로그래밍
    문제 이름: 2 x n 타일링
 */


import java.util.Scanner;

public class Main_12900 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] d = new int[n + 1];
        d[0] = 1;
        d[1] = 1;

        for (int i = 2; i <= n; i++) {
            d[i] = d[i - 1] + d[i - 2];
            d[i] %= 1000000007;
        }

        System.out.println(d[n]);
    }
}
