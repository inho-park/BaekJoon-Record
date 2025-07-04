package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class First_2075 {
	// 입력
	//	첫째 줄에 N(1 ≤ N ≤ 1,500)이 주어진다. 
	//	다음 N개의 줄에는 각 줄마다 N개의 수가 주어진다. 표에 적힌 수는 -10억보다 크거나 같고, 10억보다 작거나 같은 정수이다.
	// 출력
	//	첫째 줄에 N번째 큰 수를 출력한다.

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < n; j++) {
				pq.offer(Integer.parseInt(st.nextToken()));
			}
		}
		
		for (int i = 0; i < n - 1; i++) {
			pq.poll();
		}
		
		System.out.print(pq.poll());
	}
	
}