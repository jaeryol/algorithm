package boj.tree;

/*
    링크 : https://www.acmicpc.net/problem/1991
    유형 : 트리
    문제 이름 : 트리 순회

    전위(PreOrder), 중위(InOrder), 후위(PostOrder) 순회 각각 구현
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main_1991 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList<ArrayList<Integer>> a = new ArrayList();

        for (int i = 0; i < n; i++) {
            a.add(new ArrayList());
        }

        for (int i = 0; i < n; i++) {
            String[] splits = scanner.nextLine().split(" ");
            for (int j = 1; j < 3; j++) {
                a.get(splits[0].charAt(0) - 65)
                 .add(splits[j].charAt(0) - 65);
            }
        }

        PreOrder(a, 0);
        System.out.println();

        InOrder(a, 0);
        System.out.println();

        PostOrder(a, 0);
        System.out.println();

    }

    public static void PreOrder(
        ArrayList<ArrayList<Integer>> a, int root) {
        System.out.print((char)(root + 65));

        for (int j = 0; j < 2; j++) {
            int c = a.get(root).get(j);
            if ((char)(c + 65) != '.') {
                PreOrder(a, c);
            }
        }
    }

    public static void InOrder(
        ArrayList<ArrayList<Integer>> a, int root) {
        for (int j = 0; j < 2; j++) {
            int c = a.get(root).get(j);
            if ((char)(c + 65) != '.') {
                InOrder(a, c);
            }
            if (j == 0) System.out.print((char)(root + 65));
        }

    }

    public static void PostOrder(
        ArrayList<ArrayList<Integer>> a, int root) {
        for (int j = 0; j < 2; j++) {
            int c = a.get(root).get(j);
            if ((char)(c + 65) != '.') {
                PostOrder(a, c);
            }
        }
        System.out.print((char)(root + 65));
    }
}
