package boj.graph;

/*
    링크 : https://www.acmicpc.net/problem/1260
    유형 : 그래프
    문제 이름 : DFS와 BFS
 */

import java.util.*;

public class Main_1260 {
    public static ArrayList<ArrayList<Integer>> d;
    public static boolean[] c;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();

        d = new ArrayList(n + 1);
        for (int i = 0; i <= n; i++) {
            d.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            d.get(a).add(b);
            d.get(b).add(a);
        }

        for (int i = 1; i <= n; i++){
            Collections.sort(d.get(i));
        }

        c = new boolean[n + 1];
        dfs(s);
        System.out.println();

        Arrays.fill(c, false);
        bfs(s);
    }

    public static void dfs(int s) {
        if (c[s]) {
            return;
        }

        c[s] = true;
        System.out.print(s + " ");

        for (int v : d.get(s)) {
            if (c[v] == false) {
                dfs(v);
            }
        }
    }

    public static void bfs(int s) {
        Queue<Integer> q = new LinkedList();

        c[s] = true;
        q.offer(s);

        while (q.isEmpty() == false) {
            int v = q.poll();
            System.out.print(v + " ");

            for (int i = 0 ; i < d.get(v).size(); i++) {
                int k = d.get(v).get(i);
                if (c[k] == false) {
                    c[k] = true;
                    q.offer(k);
                }
            }
        }
    }
}