package combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_4134 {
	
// �Է�
//	ù° �ٿ� �׽�Ʈ ���̽��� ������ �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���� n�� �־�����.
// ���
//	������ �׽�Ʈ ���̽��� ���ؼ� n���� ũ�ų� ���� �Ҽ� �� ���� ���� �Ҽ��� �� �ٿ� �ϳ��� ����Ѵ�.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			Long prime = Long.parseLong(br.readLine());
			while (true) {
				if (isPrime(prime)) {
					sb.append(prime + "\n");
					break;
				}
				prime++;
			}
		}
		System.out.print(sb);
		
	}
	
	static boolean isPrime(Long num) {
		if (num == 0 || num == 1) return false;
	    for (int i = 2; i <= Math.sqrt(num); i++) {
	    	if (num % i == 0) return false;
	    }
	    return true;
	}
}
