package math.sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_2559 {
	// �Է�
	// ù° �ٿ��� �� ���� ���� N�� K�� �� ���� ������ ���̿� �ΰ� ������� �־�����. 
	//	ù ��° ���� N�� �µ��� ������ ��ü ��¥�� ���̴�. N�� 2 �̻� 100,000 �����̴�. 
	//	�� ��° ���� K�� ���� ���ϱ� ���� �������� ��¥�� ���̴�. K�� 1�� N ������ �����̴�. 
	//	��° �ٿ��� ���� ������ �µ��� ��Ÿ���� N���� ������ ��ĭ�� ���̿� �ΰ� �־�����. �� ������ ��� -100 �̻� 100 �����̴�.
	// ���
	//	ù° �ٿ��� �ԷµǴ� �µ��� �������� �������� K���� �µ��� ���� �ִ밡 �Ǵ� ���� ����Ѵ�.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		int results[] = new int [n + 1], result = Integer.MIN_VALUE;
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i <= n; i++) results[i] = results[i - 1] + Integer.parseInt(st.nextToken());
		for (int i = k; i <= n; i++) {
			int temp = results[i] - results[i - k];
			if (result < temp) result = temp;
		}
		System.out.print(result);
	}
}
