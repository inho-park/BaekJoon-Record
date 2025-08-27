package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_2501 {
	// �Է�
	//	ù° �ٿ� N�� K�� ��ĭ�� ���̿� �ΰ� �־�����. N�� 1 �̻� 10,000 �����̴�. K�� 1 �̻� N �����̴�.
	// ���
	//	ù° �ٿ� N�� ����� �� K��°�� ���� ���� ����Ѵ�. ���� N�� ����� ������ K������ ��� K��° ����� �������� ���� ��쿡�� 0�� ����Ͻÿ�.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) k--;
			if (k == 0) {
				System.out.print(i);
				System.exit(0);
			}
		}
		System.out.print(0);
	}
}