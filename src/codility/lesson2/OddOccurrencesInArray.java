package codility.lesson2;

/*
    문제 이름 : OddOccurrencesInArray
    문제 링크 : https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
    채점 결과 링크 : https://app.codility.com/demo/results/trainingAQNF73-BDV/
 */

import java.util.*;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        int[] A = new int[]{ 9, 3, 9, 3, 9, 7, 9};

        Set<Integer> set = new HashSet();
        for (int v : A) {
            if (set.contains(v)) {
                set.remove(v);
            } else {
                set.add(v);
            }
        }

        System.out.println(set.iterator().next());
    }
}
