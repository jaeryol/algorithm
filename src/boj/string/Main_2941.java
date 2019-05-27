package boj.string;

/*
    링크 : https://www.acmicpc.net/problem/2941
    유형 : 문자열 처리
    문제 이름 : 크로아티아 알파벳
 */

import java.util.Scanner;

public class Main_2941 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        int croAlphabet = 0;
        int length = line.length();
        for (int i = 0; i < length - 1; i++) {
            char c = line.charAt(i);
            if (c == 'c' && ((line.charAt(i + 1) == '=') || (line.charAt(i + 1) == '-'))) {
                i++;
                croAlphabet++;
                continue;
            }

            if (c == 'd' && line.charAt(i + 1) == 'z' && line.charAt(i + 2) == '=') {
                i += 2;
                croAlphabet += 2;
                continue;
            }

            if (c == 'd' && line.charAt(i + 1) == '-') {
                i++;
                croAlphabet++;
                continue;
            }

            if ((c == 'l'|| c == 'n') && line.charAt(i + 1) == 'j') {
                i++;
                croAlphabet++;
                continue;
            }


            if ((c == 's' || c == 'z') && line.charAt(i + 1) == '=') {
                i++;
                croAlphabet++;
                continue;
            }
        }

        System.out.println(length - croAlphabet);
        scanner.close();
    }
}
