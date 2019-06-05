package boj.queue;

/*
    링크 : https://www.acmicpc.net/problem/10845
    유형 : 큐
    문제 이름 : 큐
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_10845 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        scanner.nextLine();

        Queue<Integer> queue = new LinkedList();
        int last = 0;
        while (r-- > 0) {
            String[] splits = scanner.nextLine().split(" ");
            switch (splits[0]) {
                case "push":
                    Integer v = Integer.valueOf(splits[1]);
                    queue.offer(v);
                    last = v;
                    break;
                case "pop":
                    if (queue.size() == 0) {
                        System.out.println("-1");
                    } else {
                        System.out.println(queue.poll());
                    }
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    System.out.println(queue.isEmpty() ? "1" : "0");
                    break;
                case "front":
                    System.out.println(queue.size() != 0 ? queue.peek() : "-1");
                    break;
                case "back":
                    System.out.println(queue.size() != 0 ? last : "-1");
                    break;
            }
        }
        scanner.close();
    }
}
