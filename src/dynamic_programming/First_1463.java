package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_1463 {
	// 틀린 이유
	//	시간 초과 => 해답은 Top-Down 에서 Bottom-Up 방식으로의 전환
	
	// 입력
	//  첫째 줄에 1보다 크거나 같고, 106보다 작거나 같은 정수 N이 주어진다.
	// 출력
	//	첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.
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