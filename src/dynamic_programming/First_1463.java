package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_1463 {
	// Ʋ�� ����
	//	�ð� �ʰ� => �ش��� Top-Down ���� Bottom-Up ��������� ��ȯ
	
	// �Է�
	//  ù° �ٿ� 1���� ũ�ų� ����, 106���� �۰ų� ���� ���� N�� �־�����.
	// ���
	//	ù° �ٿ� ������ �ϴ� Ƚ���� �ּڰ��� ����Ѵ�.
	static int dp[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp = new int [n + 1];
		dp[2] = 1;
		System.out.println(solve(n));
	}
	
	
	public static int solve(int n) {
		if (n > 1) {
			dp[n] = solve(n - 1) + 1;
			if (n % 2 == 0) dp[n] = Math.min(dp[n], solve(n/2) + 1);
			if (n % 3 == 0) dp[n] = Math.min(dp[n], solve(n/3) + 1);
		}
		return dp[n];
	}
}