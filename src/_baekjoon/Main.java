package _baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	// 입력
	//  첫째 줄에 1보다 크거나 같고, 106보다 작거나 같은 정수 N이 주어진다.
	// 출력
	//	첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.
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
