package _baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	// �Է�
	//  ù° �ٿ� 1���� ũ�ų� ����, 106���� �۰ų� ���� ���� N�� �־�����.
	// ���
	//	ù° �ٿ� ������ �ϴ� Ƚ���� �ּڰ��� ����Ѵ�.
	static int dp[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp = new int [n + 1];
		System.out.println(solve(n));
	}
	
	
	public static int solve(int n) {
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + 1;
			if (i % 2 == 0) dp[i] = Math.min(dp[i/2] + 1, dp[i]);
			if (i % 3 == 0) dp[i] = Math.min(dp[i/3] + 1, dp[i]);
		}
		return dp[n];
	}
}
