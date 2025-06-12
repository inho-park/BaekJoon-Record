package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class First_11279 {
	// �Է�
	//	ù° �ٿ� ������ ���� N(1 �� N �� 100,000)�� �־�����. ���� N���� �ٿ��� ���꿡 ���� ������ ��Ÿ���� ���� x�� �־�����. 
	//	���� x�� �ڿ������ �迭�� x��� ���� �ִ�(�߰��ϴ�) �����̰�, x�� 0�̶�� �迭���� ���� ū ���� ����ϰ� �� ���� �迭���� �����ϴ� ����̴�. 
	//	�ԷµǴ� �ڿ����� 2^31���� �۴�.
	// ���
	//	�Է¿��� 0�� �־��� Ƚ����ŭ ���� ����Ѵ�. ���� �迭�� ��� �ִ� ����ε� ���� ū ���� ����϶�� �� ��쿡�� 0�� ����ϸ� �ȴ�.
	// ���п���
	// 	�ð� �ʰ� (�����͸� ����� ������ ������ ���� ����)
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(br.readLine());
			if (temp == 0) {
				if (list.isEmpty()) {
					sb.append("0");
				} else {					
					list.sort(null);
					sb.append(list.get(list.size() - 1));
					list.remove(list.size() - 1);
				}
				sb.append("\n");
			} else {
				list.add(temp);
			}
		}
		
		System.out.print(sb);
	}
}
