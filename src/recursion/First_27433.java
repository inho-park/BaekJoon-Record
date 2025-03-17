package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_27433 {
	// �Է�
	//	0���� ũ�ų� ���� ���� N�� �־�����. �̶�, N!�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	// ���
	//	ù° �ٿ� ���� N(0 �� N �� 20)�� �־�����
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.print(recursion(n));
	}
	
	static long recursion(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * recursion(n - 1);
		}
	}
}
