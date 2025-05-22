package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_11401 {
	// �Է�
	//	ù° �ٿ� N�� K�� �־�����. (1 �� N �� 4,000,000, 0 �� K �� N)
	// ���
	//	binom{N}{K}�� 1,000,000,007�� ���� �������� ����Ѵ�.
	
	// ���� ���� : �ð��ʰ�
	// n, k�� ���� ���� ����� F(n, k)�� ���� ��, F(n, k) = F(n - 1, k - 1) + F(n, k - 1)�� Ư���� �ݿ��ߴ���, 
	// n �� k �� Ư�� ��Ȳ�� �� ��� �Լ� ����� �ʹ� �������� ����ӵ� ���� Ex) n = 4000000, k = 2000000
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		System.out.print(recursion(n, k));
	}
	
	static long recursion(int n, int k) {
		if (n < k) return 0;
		if (k == 1 || n - k == 1) {
			return n;
		}
		else if (k == 0 || n == k) {
			return 1;
		}
		
		long temp = recursion(n - 1, k);
		long temp2 = recursion(n - 1, k - 1);
		if (temp + temp2 > 1000000007) return (temp + temp2) % 1000000007;
		else return temp + temp2;
	}
}