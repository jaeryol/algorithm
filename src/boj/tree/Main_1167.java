package boj.tree;

/*
    링크 : https://www.acmicpc.net/problem/1167
    유형 : 트리
    문제 이름 : 트리의 지름
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_1167 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList<ArrayList<Node>> a = new ArrayList();
        for (int i = 0; i <= n; i++) {
            a.add(new ArrayList());
        }

        for (int i = 0; i < n; i++) {
            String[] splits = scanner.nextLine().split(" ");
            int root = Integer.valueOf(splits[0]);
            int j = 1;
            while (true) {
                if (Integer.valueOf(splits[j]) == -1) {
                    break;
                }
                a.get(root).add(new Node(Integer.valueOf(splits[j]), Integer.valueOf(splits[j + 1])));
                j += 2;
            }
        }

        int[] d = Bfs(a, n, 1);
        int start = 1;
        for (int i = 2; i <= n; i++) {
            if (d[i] > d[start]) {
                start = i;
            }
        }

        d = Bfs(a, n, start);
        int ans = d[1];
        for (int i=2; i<=n; i++) {
            if (ans < d[i]) {
                ans = d[i];
            }
        }

        System.out.println(ans);
        scanner.close();
    }

    public static int[] Bfs(ArrayList<ArrayList<Node>> a, int n, int start) {
        boolean[] check = new boolean[n + 1];
        int[] distance = new int[n + 1];
        Queue<Integer> q = new LinkedList();
        q.offer(start);
        check[start] = true;

        while (q.isEmpty() == false) {
            int r = q.poll();
            for (Node node : a.get(r)) {
                int c = node.child;
                int d = node.weight;

                if (check[c] == false) {
                    check[c] = true;
                    distance[c] = distance[r] + d;
                    q.offer(c);
                }
            }
        }

        return distance;
    }

    public static class Node {
        private int child;
        private int weight;

        public Node(int child, int weight) {
            this.child = child;
            this.weight = weight;
        }
    }
}
