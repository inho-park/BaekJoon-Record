package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class First_2696 {
	// 입력
	//	첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 
	//	각 테스트 케이스의 첫째 줄에는 수열의 크기 M(1 ≤ M ≤ 9999, M은 홀수)이 주어지고, 그 다음 줄부터 이 수열의 원소가 차례대로 주어진다. 
	//	원소는 한 줄에 10개씩 나누어져있고, 32비트 부호있는 정수이다.
	// 출력
	//	각 테스트 케이스에 대해 첫째 줄에 출력하는 중앙값의 개수를 출력하고, 
	//	둘째 줄에는 홀수 번째 수를 읽을 때 마다 구한 중앙값을 차례대로 공백으로 구분하여 출력한다. 
	//	이때, 한 줄에 10개씩 출력해야 한다.

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			PriorityQueue<Integer> minPq = new PriorityQueue<>(Collections.reverseOrder());
			PriorityQueue<Integer> maxPq = new PriorityQueue<>();
			int m = Integer.parseInt(br.readLine()), cnt = 0;
			sb.append(m / 2 + 1).append("\n");
			for (int j = 0; j < m; j++) {
				if (j % 10 == 0) {
					st = new StringTokenizer(br.readLine(), " ");
				}
				
				if (j % 2 == 0) {
					minPq.offer(Integer.parseInt(st.nextToken()));
				} else {
					maxPq.offer(Integer.parseInt(st.nextToken()));
				}
				
				if (!minPq.isEmpty() && !maxPq.isEmpty()) {
					if (minPq.peek() > maxPq.peek()) {
						int swap = minPq.poll();
						minPq.offer(maxPq.poll());
						maxPq.offer(swap);
					}
				}
				
				if (j % 2 == 0) {
					sb.append(minPq.peek()).append(" ");
					cnt++;
					if (cnt%10 == 0) {
						sb.append("\n");
					}
				}
			}
			sb.append("\n");
		}
		
		System.out.print(sb);
	}
	
}