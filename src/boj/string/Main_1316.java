package boj.string;

/*
    링크 : https://www.acmicpc.net/problem/1316
    유형 : 문자열 처리
    문제 이름 : 그룹 단어 체커
 */

import java.util.HashMap;
import java.util.Scanner;

public class Main_1316 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        scanner.nextLine();

        int ans = 0;
        while (r-- > 0) {
            String line = scanner.nextLine();

            HashMap<Character, Boolean> map = new HashMap();
            map.put(line.charAt(0), true);
            boolean flag = true;
            for (int i = 1; i < line.length(); i++) {
                char c = line.charAt(i);
                if (map.getOrDefault(c, false) && line.charAt(i - 1) != c) {
                    flag = false;
                    break;
                }

                map.put(c, true);
            }

            if (flag){
                ans++;
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}
