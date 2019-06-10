package boj.queue;

/*
    링크 : https://www.acmicpc.net/problem/11866
    유형 : 큐
    문제 이름 : 조세퍼스 문제 0
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_11866 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        Queue<Integer> queue = new LinkedList();
        for (int i = 0; i < N; i++) {
            queue.offer(i + 1);
        }

        StringBuilder sb = new StringBuilder("<");
        while (true) {
            if (queue.size() == 1) {
                break;
            }
            for (int i = 0; i < K - 1; i++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll() + ", ");
        }

        sb.append(queue.poll() + ">");
        System.out.println(sb);
        scanner.close();
    }
}
