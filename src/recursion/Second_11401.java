package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Second_11401 {
	// �Է�
	//	ù° �ٿ� N�� K�� �־�����. (1 �� N �� 4,000,000, 0 �� K �� N)
	// ���
	//	binom{N}{K}�� 1,000,000,007�� ���� �������� ����Ѵ�.
	
	final static long P = 1000000007;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long n = Integer.parseInt(st.nextToken());
		long k = Integer.parseInt(st.nextToken());
		
		long numerator = factorial(n);
		long denominator = factorial(k) * factorial(n - k) % P;
		
		System.out.print(numerator * recursion(denominator, P - 2) % P);
	}
	
	static long recursion(long n, long k) {
		if (k == 1) {
			return n % P;
		}
		
		long mod = recursion(n, k/2);
		if (k % 2 == 1) {
			return (mod * mod % P) * n % P;
		}
		
		return mod * mod % P;
	}
	
	static long factorial(long n) {
		long result = 1;
		
		while (n > 1) {
			result = result * n % P;
			n--;
		}
		return result;
	}
}