package binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class First_1300 {
	// �Է�
	//	ù° �ٿ� �迭�� ũ�� N�� �־�����. N�� 105���� �۰ų� ���� �ڿ����̴�. 
	//	��° �ٿ� k�� �־�����. k�� min(109, N2)���� �۰ų� ���� �ڿ����̴�.
	// ���
	//	B[k]�� ����Ѵ�.
	// ����
	// n^2�� ��츦 ������ ť�� ��Ƴ� �����Ͱ� ���� ������ 128�ް��� �ѱ�
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