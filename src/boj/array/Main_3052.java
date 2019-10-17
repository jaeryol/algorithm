package boj.array;

/*
    링크 : https://www.acmicpc.net/problem/3052
    유형 : 배열
    문제 이름 : 나머지
 */

import java.util.HashSet;
import java.util.Scanner;

public class Main_3052 {
    public static void main(String[] args) {
        HashSet<Integer> result = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            result.add(scanner.nextInt() % 42);
        }

        System.out.println(result.size());
        scanner.close();
    }
}
