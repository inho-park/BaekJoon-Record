package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class First_28279 {
	// �Է�
	//  ù° �ٿ� ����� �� N�� �־�����. (1 �� N �� 1,000,000)
	//  ��° �ٺ��� N�� �ٿ� ����� �ϳ��� �־�����.
	//  ����� �䱸�ϴ� ����� �ϳ� �̻� �־�����.
	// ���
	//	����� �䱸�ϴ� ����� �־��� ������ ����� ����� �� �ٿ� �ϳ��� ����Ѵ�.
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> d = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			switch(Integer.parseInt(st.nextToken())) {
				case 1:
					d.addFirst(Integer.parseInt(st.nextToken()));
					break;
				case 2:
					d.addLast(Integer.parseInt(st.nextToken()));
					break;
				case 3:
					if (d.isEmpty()) sb.append(-1 + "\n");
					else sb.append(d.pollFirst() + "\n");
					break;
				case 4:
					if (d.isEmpty()) sb.append(-1 + "\n");
					else sb.append(d.pollLast() + "\n");
					break;
				case 5:
					sb.append(d.size() + "\n");
					break;
				case 6:
					sb.append(d.isEmpty()?1 + "\n":0 + "\n");
					break;
				case 7:
					if (d.isEmpty()) sb.append(-1 + "\n");
					else sb.append(d.peekFirst() + "\n");
					break;
				default:
					if (d.isEmpty()) sb.append(-1 + "\n");
					else sb.append(d.peekLast() + "\n");
					break;
			}
		}
		System.out.print(sb);
	}
}
