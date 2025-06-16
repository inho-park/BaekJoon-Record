package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class First_112886 {
	// �Է�
	//	ù° �ٿ� ������ ���� N(1��N��100,000)�� �־�����. ���� N���� �ٿ��� ���꿡 ���� ������ ��Ÿ���� ���� x�� �־�����. 
	//	���� x�� 0�� �ƴ϶�� �迭�� x��� ���� �ִ�(�߰��ϴ�) �����̰�, x�� 0�̶�� �迭���� ������ ���� ���� ���� ����ϰ� �� ���� �迭���� �����ϴ� ����̴�. 
	//	�ԷµǴ� ������ -2^31���� ũ��, 2^31���� �۴�.
	// ���
	//	�Է¿��� 0�� �־��� ȸ����ŭ ���� ����Ѵ�. ���� �迭�� ��� �ִ� ����ε� ������ ���� ���� ���� ����϶�� �� ��쿡�� 0�� ����ϸ� �ȴ�.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if (Math.abs(o1) == Math.abs(o2)) {
					if (o1 < o2) 
						return -1;
					else 
						return 1;
				} else {
					return Math.abs(o1) - Math.abs(o2);
				}
			}
		
		});
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
				queue.add(temp);
			}
		}
		
		System.out.print(sb);
	}
}