package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class First_2696 {
	// �Է�
	//	ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 �� T �� 1,000)�� �־�����. 
	//	�� �׽�Ʈ ���̽��� ù° �ٿ��� ������ ũ�� M(1 �� M �� 9999, M�� Ȧ��)�� �־�����, �� ���� �ٺ��� �� ������ ���Ұ� ���ʴ�� �־�����. 
	//	���Ҵ� �� �ٿ� 10���� ���������ְ�, 32��Ʈ ��ȣ�ִ� �����̴�.
	// ���
	//	�� �׽�Ʈ ���̽��� ���� ù° �ٿ� ����ϴ� �߾Ӱ��� ������ ����ϰ�, 
	//	��° �ٿ��� Ȧ�� ��° ���� ���� �� ���� ���� �߾Ӱ��� ���ʴ�� �������� �����Ͽ� ����Ѵ�. 
	//	�̶�, �� �ٿ� 10���� ����ؾ� �Ѵ�.

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