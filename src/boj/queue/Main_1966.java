package boj.queue;

/*
    링크 : https://www.acmicpc.net/problem/1966
    유형 : 큐
    문제 이름 : 프린터 큐
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_1966 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();

        while (r-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            Queue<Integer> queue = new LinkedList();
            for (int i = 0; i < n; i++) {
                queue.offer(scanner.nextInt());
            }

            int index = 0;
            int ans = 0;
            while (true) {
                if (index == n) {
                    index = 0;
                }

                int current = queue.poll();
                if (current == 0) {
                    queue.offer(current);
                    index++;
                    continue;
                }

                boolean flag = true;
                for (int v : queue) {
                    if (current < v) {
                        queue.offer(current);
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    ans++;
                    if (index == m) {
                        System.out.println(ans);
                        break;
                    }
                    queue.offer(0);
                }
                index++;
            }

        }

        scanner.close();
    }
}
