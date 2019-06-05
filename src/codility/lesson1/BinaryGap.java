package codility.lesson1;

/*
    문제 이름 : BinaryGap
    문제 링크 : https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
    채점 결과 링크 : https://app.codility.com/demo/results/trainingN735VK-PP4/
 */


public class BinaryGap {
    public static void main(String[] args) {
        int N = 6;
        boolean flag = false;
        int cnt = 0;
        int ans = 0;

        while (true) {
            if (N % 2 == 1 && flag) {
                if (ans < cnt) {
                    ans = cnt;
                    cnt = 0;
                }
            }
            if (N % 2 == 1) {
                flag = true;
                cnt = 0;
            } else {
                cnt++;
            }

            if (N / 2 < 1) {
                break;
            }
            N /= 2;
        }

        System.out.println(ans);
    }
}
