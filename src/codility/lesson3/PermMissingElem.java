package codility.lesson3;

/*
    문제 이름 : PermMissingElem
    문제 링크 : https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
    채점 결과 링크 : https://app.codility.com/demo/results/training847W5J-7UW/
 */

import java.util.Arrays;

public class PermMissingElem {
    public static void main(String[] args) {
        // [1] => 2
        // [2, 3, 4, 1] = > 5
        // [1, 4, 3] => 2
        // [2] => 1
        int[] A = new int[] {2};
        System.out.println(function(A));
    }

    public static int function(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (i + 1 != A[i]) {
                return i + 1;
            }
        }

        return A.length + 1;
    }
}
