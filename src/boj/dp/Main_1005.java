package boj.dp;

/*
    링크 : https://www.acmicpc.net/problem/1005
    유형 : 다이나믹 프로그래밍(위상 정렬)
    문제 이름 : ACM Craft

    dp 유형의 문제로 정의되어 있으나 위상정렬(Topological Sort)이 필요한 문제,
    위상정렬에 대해 공부 후 풀이 하는게 좋다.

    위상정렬 참고 사이트
     - https://bcp0109.tistory.com/21
 */

import java.util.*;

public class Main_1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 테스트 케이스 수
        int T = scanner.nextInt();

        while(T-- > 0) {
            // 건물의 개수(1 ~ N)
            int N = scanner.nextInt();
            // 건설 규칙 수
            int K = scanner.nextInt();
            // 건물당 걸리는 시간
            int[] D = new int[N + 1];
            for (int i = 1; i <=N; i++) {
                D[i] = scanner.nextInt();
            }

            // 인접 리스트 선언 및 초기화
            List<List<Integer>> list = new ArrayList();
            for (int i = 0; i <= N; i++) {
                list.add(new ArrayList());
            }

            // 진입 차수 선언
            int[] inDegree = new int[N + 1];

            for (int i = 0; i < K; i++) {
                int from = scanner.nextInt();
                int to = scanner.nextInt();

                list.get(from).add(to);
                inDegree[to]++;
            }

            // 건물 W를 완료하는데 필요한 최소 시간
            int W = scanner.nextInt();

            // 위상 정렬 자체가 목적이 아닌 위상 정렬 방식을 이용한 방법이므로
            // 진입 차수를 담기 위한 큐를 하나만 사용한다.
            Queue<Integer> queue = new LinkedList();
            int[] ans = new int[N + 1];
            for (int i = 0; i <= N; i++) {
                // 최초 노드(정점)의 시작이 꼭 1이 아닐 수 있으므로
                // ans[i] 에 D[i]를 넣어 줘야 한다.
                ans[i] = D[i];
                if (inDegree[i] == 0) {
                    queue.offer(i);
                }
            }

            while (queue.isEmpty() == false) {
                int from = queue.poll();
                for (int to : list.get(from)) {
                    // ans[to]에는 다른 정점으로부터 현재 정점까지의 건물 완료 총 시간이 들어있다.
                    // 예를 들어, 2 -> 4 와 3 -> 4가 될 수 있다.
                    // 이전 정점의 값(즉, 이전 건물 완료에 필요한 총 시간)과 현재 정점의 건물 완료 시간을 더한 값과 비교해 저장한다.
                    ans[to] = Math.max(ans[to], ans[from] + D[to]);
                    if (--inDegree[to] == 0) {
                        // inDegree[to] 가 '0'이라는 것은 다른 정점으로부터 현재 정점까지 오는 정점이 더 이상 없다는 의미
                        queue.offer(to);
                    }
                }
            }

            System.out.println(ans[W]);
        }

        scanner.close();
    }
}
