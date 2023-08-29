package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_24511 {
	// Ʋ�� ����
	//  �ð� �ʰ�
	// �Է�
	//  ù° �ٿ� queuestack�� �����ϴ� �ڷᱸ���� ���� N�� �־�����. 
	//  ��° �ٿ� ���� N�� ���� A�� �־�����. i�� �ڷᱸ���� ť��� A_i = 0, �����̶�� A_i = 1�̴�.
	//  ��° �ٿ� ���� N�� ���� B�� �־�����. B_i�� i�� �ڷᱸ���� ��� �ִ� �����̴�.
	//	��° �ٿ� ������ ������ ���� M�� �־�����.
	//  �ټ�° �ٿ� queuestack�� ������ ���Ҹ� ��� �ִ� ���� M�� ���� C�� �־�����. 
	// ���
	//	���� C�� ���Ҹ� ���ʴ�� queuestack�� �������� ���� ���ϰ��� �������� �����Ͽ� ����Ѵ�.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()), val;
		boolean [] boolArr = new boolean [n];
		int [] queuestack = new int [n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) boolArr[i] = Integer.parseInt(st.nextToken()) == 1?true:false;
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) queuestack[i] = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(br.readLine());
		int [] values = new int [m];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < m; i++) {
			val = Integer.parseInt(st.nextToken());
			for (int j = 0; j < n; j++) {
				if (!boolArr[j]) {
					int temp = val;
					val = queuestack[j];
					queuestack[j] = temp;
				}
			}
			sb.append(val + " ");
		}
		System.out.print(sb);
	}
}
