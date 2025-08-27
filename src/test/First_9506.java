package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_9506 {
	// �Է�
	//	�Է��� �׽�Ʈ ���̽����� �� �� �������� n�� �־�����. (2 < n < 100,000) �Է��� �������� -1�� �־�����.
	// ���
	//	�׽�Ʈ���̽� ���� ���ٿ� �ϳ��� ����ؾ� �Ѵ�.
	//	n�� ���������, n�� n�� �ƴ� ������� ������ ��Ÿ���� ����Ѵ�(���� ��� ����).
	//	�̶�, ������� ������������ �����ؾ� �Ѵ�.
	//	n�� �������� �ƴ϶�� n is NOT perfect. �� ����Ѵ�.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while (n != -1) {
			int total = 1;
			String str = n + " = 1";
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					total += i;
					str += " + " + i;
				}
				
			}
			if (total == n) sb.append(str).append("\n");
			else sb.append(n + " is NOT perpect.").append("\n");
			n = Integer.parseInt(br.readLine());
		}
		System.out.print(sb);
	}
}