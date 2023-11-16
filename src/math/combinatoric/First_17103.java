package math.combinatoric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_17103 {
	// �Է�
	//	ù° �ٿ� �׽�Ʈ ���̽��� ���� T (1 �� T �� 100)�� �־�����. 
	//	�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���� N�� ¦���̰�, 2 < N �� 1,000,000�� �����Ѵ�
	// ���
	//	������ �׽�Ʈ ���̽����� ������ ��Ƽ���� ���� ����Ѵ�.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()), cnt = 0;
		boolean [] primes = new boolean [1000001];
		for (int i = 2; i < 1000001; i++) {
			primes[i] = isPrime(i);
		}
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(br.readLine());
			for (int j = 2; j <= temp/2; j++) {
				if (primes[j] && primes[temp - j]) {
					cnt++;
				}
			}
			sb.append(cnt + "\n");
			cnt = 0;
		}
		
		System.out.print(sb);

	}
	
	static boolean isPrime(int num) {
		if (num == 0 || num == 1) return false;
	    for (int i = 2; i <= Math.sqrt(num); i++) {
	    	if (num % i == 0) return false;
	    }
	    return true;
	}
}
