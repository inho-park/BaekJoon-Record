package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_24313 {
	// �Է�
	//	ù° �ٿ� �Լ� f(n)�� ��Ÿ���� ���� a1, a0�� �־�����. (0 �� |ai| �� 100)
	//	���� �ٿ� ���� ���� c�� �־�����. (1 �� c �� 100)
	//	���� �ٿ� ���� ���� n0�� �־�����. (1 �� n0 �� 100)
	// ���
	//	f(n), c, n0�� O(n) ���Ǹ� �����ϸ� 1, �ƴϸ� 0�� ����Ѵ�.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a1 = Integer.parseInt(st.nextToken());
		int a0 = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(br.readLine());
		int n0 = Integer.parseInt(br.readLine());
		boolean isO = true;
		for (int i = n0; i <= 100; i++) {
			if (a1 * i + a0 > c * i) {
				isO = false;
			}
		}
		System.out.print(isO ? 1 : 0);
	}
}