package codility.lesson3;

/*
    문제 이름 : FrogJmp
    문제 링크 : https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
    채점 결과 링크 : https://app.codility.com/demo/results/training5RGN9H-DDT/

    매우 간단한 문제이나 나머지(remainder)가 '0'일 경우(나머지는 항상 D보다 작음)에 대한 고려를
    처음에 하지 않아 전체 채점에서 감점, 다양한 테스트 조건에 대해서 신경써야 함.
 */

public class FrogJmp {
    public static void main(String[] args) {
        int X = 10;
        int Y = 85;
        int D = 30;

        Y -= X;
        int ans = Y / D;
        int remainder = Y % D;
        if (remainder != 0 && remainder < D) {
            ans++;
        }

        System.out.println(ans);
    }
}
