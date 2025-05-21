package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_1629 {
	// �Է�
	//	ù° �ٿ� A, B, C�� �� ĭ�� ���̿� �ΰ� ������� �־�����. A, B, C�� ��� 2,147,483,647 ������ �ڿ����̴�.
	// ���
	//	ù° �ٿ� A�� B�� ���� ���� C�� ���� �������� ����Ѵ�.
	
	static long c;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		c = Long.parseLong(st.nextToken());
		
		System.out.print(recursion(a, b));
	}
	
	static long recursion(long n, long k) {
		if (k == 1) {
			return n % c;
		}
		
		long mod = recursion(n, k/2);
		if (k % 2 == 1) {
			return (mod * mod % c) * n % c;
		}
		
		return mod * mod % c;
	}
}