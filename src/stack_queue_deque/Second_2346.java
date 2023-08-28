package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Second_2346 {
	// �ذ� ���
	//  LinkedList �� �ϳ��� ��忡 �����͸� �ٴ� ������ ��� �ϳ��� �����ϴ� �޸𸮰� ArrayList �������� ũ�� ������ �޸� ȿ���� ����
	//  Array �� ����ؾ��Ѵ� -> ��� �ð� ������ 2�ʳ� �� �� ������ �� �� �־��µ� �ƽ��� �κ�
	
	// �Է�
	//  ù° �ٿ� �ڿ��� N(1 �� N �� 1,000)�� �־�����. ���� �ٿ��� ���ʷ� �� ǳ�� ���� ���̿� ���� �ִ� ���� �־�����. ���̿� 0�� �������� �ʴ�.
	// ���
	//	ù° �ٿ� ���� ǳ���� ��ȣ�� ���ʷ� �����Ѵ�.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Deque<int []> d = new ArrayDeque<>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			int [] arr = {i+1, Integer.parseInt(st.nextToken())};
			d.add(arr);
		}
		int [] k = d.pollFirst();
		sb.append(k[0] + " ");
		while(d.size() != 1) {
			if (k[1] > 0) {
				for (int i = 0; i < k[1] - 1; i++) {
					d.addLast(d.pollFirst());
				}
			} else {
				for (int i = 0; i < k[1]*-1; i++) {
					d.addFirst(d.pollLast());
				}
			}
			k = d.poll();
			sb.append(k[0] + " ");
		}
		sb.append(d.poll()[0]);
		System.out.print(sb);
	}
}
