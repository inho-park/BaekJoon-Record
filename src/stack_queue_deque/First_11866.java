package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class First_11866 {
	// �Է�
	//  ù° �ٿ� ���� N(1 �� N �� 500,000)�� �־�����.
	// ���
	//	ù° �ٿ� ���� �Ǵ� ī���� ��ȣ�� ����Ѵ�.
	
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
