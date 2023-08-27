package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class First_11866 {
	// 입력
	//  첫째 줄에 정수 N(1 ≤ N ≤ 500,000)이 주어진다.
	// 출력
	//	첫째 줄에 남게 되는 카드의 번호를 출력한다.
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) q.add(i + 1);
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		while (q.size() != 1) {
			for (int i = 0; i < k - 1; i++) {
				q.add(q.poll());
			}
			sb.append(q.poll() + ", ");
		}
		sb.append(q.poll() + ">");
		System.out.print(sb);
	}
}
