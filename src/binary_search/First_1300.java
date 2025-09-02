package binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class First_1300 {
	// 입력
	//	첫째 줄에 배열의 크기 N이 주어진다. N은 105보다 작거나 같은 자연수이다. 
	//	둘째 줄에 k가 주어진다. k는 min(109, N2)보다 작거나 같은 자연수이다.
	// 출력
	//	B[k]를 출력한다.
	// 원인
	// n^2의 경우를 돌리며 큐에 담아낸 데이터가 문제 제약인 128메가를 넘김
	static int n;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder()); 
		int k = Integer.parseInt(br.readLine());
		int cnt = 0;
		for (int i = 1; i <= n; i++) 
			for (int j = 1;  j <= n; j++) {
				queue.offer(i * j);
				cnt++;
				if (cnt == k) {
					System.out.print(queue.poll());
					System.exit(0);
				}
			}			
	}
}