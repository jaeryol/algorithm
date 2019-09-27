package boj.array;

/*
    링크 : https://www.acmicpc.net/problem/4344
    유형 : 배열
    문제 이름 : 평균은 넘겠지
 */

import java.util.Scanner;

public class Main_4344 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCaseCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < testCaseCount; i++) {
            String[] splits = scanner.nextLine().split(" ");
            double numberOfScores = Double.parseDouble(splits[0]);

            int sumOfScores = calculateSumOfScores(splits);
            int count = getNumberOfValuesAboveAverage(
                    splits, sumOfScores, numberOfScores);

            StringBuilder result = new StringBuilder(
                    String.format("%.3f", (count / numberOfScores) * 100));
            System.out.println(result.append('%'));
        }
        scanner.close();
    }

    private static int calculateSumOfScores(String[] scores) {
        int sum = 0;
        for (int j = 1; j < scores.length; j++) {
            sum += Integer.parseInt(scores[j]);
        }

        return sum;
    }

    private static int getNumberOfValuesAboveAverage(
            String[] splits, int sumOfScores, double numberOfScores) {
        double average = sumOfScores / numberOfScores;
        int count = 0;
        for (int j = 1; j < splits.length; j++) {
            if (Double.parseDouble(splits[j]) > average) {
                count++;
            }
        }
        return count;
    }
}
