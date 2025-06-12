package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Second_11279 {
	// 입력
	//	첫째 줄에 연산의 개수 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 N개의 줄에는 연산에 대한 정보를 나타내는 정수 x가 주어진다. 
	//	만약 x가 자연수라면 배열에 x라는 값을 넣는(추가하는) 연산이고, x가 0이라면 배열에서 가장 큰 값을 출력하고 그 값을 배열에서 제거하는 경우이다. 
	//	입력되는 자연수는 2^31보다 작다.
	// 출력
	//	입력에서 0이 주어진 횟수만큼 답을 출력한다. 만약 배열이 비어 있는 경우인데 가장 큰 값을 출력하라고 한 경우에는 0을 출력하면 된다.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(br.readLine());
			if (temp == 0) {
				if (queue.isEmpty()) {
					sb.append("0");
				} else {
					sb.append(queue.poll());
				}
				sb.append("\n");
			} else {
				queue.offer(temp);
			}
		}
		
		System.out.print(sb);
	}
}
