package boj.string;

/*
    링크 : https://www.acmicpc.net/problem/5622
    유형 : 문자열 처리
    문제 이름 : 다이얼
*/

import java.util.Scanner;

public class Main_5622 {
    public static void main(String[] args) {
        int[] arr = new int[26];
        int dial = 3;
        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            if (cnt >= 3 && i != 25 && i != 18) {
                dial++;
                cnt = 0;
            }
            arr[i] = dial;
            cnt++;
        }

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int ans = 0;
        for (int i = 0; i < line.length(); i++) {
            int index = line.charAt(i) - 'A';
            ans += arr[index];
        }

        System.out.println(ans);

        scanner.close();
    }
}
