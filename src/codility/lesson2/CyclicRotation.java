package codility.lesson2;

/*
    문제 이름 : CyclicRotation
    문제 링크 : https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
    채점 결과 링크 : https://app.codility.com/demo/results/training7ZAXTR-7KZ/
 */

import java.util.Arrays;

public class CyclicRotation {
    public static void main(String[] args) {
        int[] A = new int[]{ 1, 2, 3, 4};
        int K = 15;
        int[] ans = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int a = (i + K) % A.length;
            ans[a] = A[i];
        }

        int[] expect = new int[]{ 2, 3, 4, 1};
        System.out.println(Arrays.equals(ans, expect));
    }
}
