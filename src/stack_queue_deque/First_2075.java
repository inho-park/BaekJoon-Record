package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class First_2075 {
	// �Է�
	//	ù° �ٿ� N(1 �� N �� 1,500)�� �־�����. 
	//	���� N���� �ٿ��� �� �ٸ��� N���� ���� �־�����. ǥ�� ���� ���� -10�ﺸ�� ũ�ų� ����, 10�ﺸ�� �۰ų� ���� �����̴�.
	// ���
	//	ù° �ٿ� N��° ū ���� ����Ѵ�.

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