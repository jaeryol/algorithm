package boj.tree;

/*
    링크 : https://www.acmicpc.net/problem/11725
    유형 : 트리
    문제 이름 : 트리의 부모 찾기
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_11725 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            a.add(new ArrayList());
        }

        for (int i = 0; i < n - 1; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            a.get(x).add(y);
            a.get(y).add(x);
        }

        boolean[] check = new boolean[n + 1];
        int[] parents = new int[n + 1];
        Queue<Integer> q = new LinkedList();
        parents[1] = 0;
        q.offer(1);
        check[1] = true;

        while (q.isEmpty() == false) {
            int i = q.poll();
            for (int j : a.get(i)) {
                if (check[j] == false) {
                    check[j] = true;
                    parents[j] = i;
                    q.offer(j);
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            System.out.println(parents[i]);
        }

        scanner.close();
    }
}
