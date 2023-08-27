package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class First_2164 {
	// 입력
	//  첫째 줄에 정수 N(1 ≤ N ≤ 500,000)이 주어진다.
	// 출력
	//	첫째 줄에 남게 되는 카드의 번호를 출력한다.
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			q.add(i+1);
		}
		boolean toggle = true;
		while(q.size()!=1) {
			if (toggle) {
				toggle = !toggle;
				q.poll();
			}else {
				toggle = !toggle;
				q.add(q.peek());
				q.poll();
			}
		}
		System.out.print(q.poll());
	}
}
