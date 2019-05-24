package boj.stack;

/*
    링크 : https://www.acmicpc.net/problem/10799
    유형 : 스택
    문제 이름 : 쇠막대기
 */

import java.util.Scanner;
import java.util.Stack;

public class Main_10799 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        function(input);
    }

    public static void function(String string) {
        char[] parentheses = string.toCharArray();
        Stack<Character> stack = new Stack<>();
        char lastParentheses = ' ';
        int pieces = 0;

        for (char c : parentheses) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (lastParentheses == ')') {
                    pieces += 1;
                    stack.pop();
                } else {
                    stack.pop();
                    pieces += stack.size();
                }
            }
            lastParentheses = c;
        }

        System.out.println(pieces);
    }
}
