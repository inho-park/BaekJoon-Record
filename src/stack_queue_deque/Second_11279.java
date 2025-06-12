package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Second_11279 {
	// �Է�
	//	ù° �ٿ� ������ ���� N(1 �� N �� 100,000)�� �־�����. ���� N���� �ٿ��� ���꿡 ���� ������ ��Ÿ���� ���� x�� �־�����. 
	//	���� x�� �ڿ������ �迭�� x��� ���� �ִ�(�߰��ϴ�) �����̰�, x�� 0�̶�� �迭���� ���� ū ���� ����ϰ� �� ���� �迭���� �����ϴ� ����̴�. 
	//	�ԷµǴ� �ڿ����� 2^31���� �۴�.
	// ���
	//	�Է¿��� 0�� �־��� Ƚ����ŭ ���� ����Ѵ�. ���� �迭�� ��� �ִ� ����ε� ���� ū ���� ����϶�� �� ��쿡�� 0�� ����ϸ� �ȴ�.
	
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
