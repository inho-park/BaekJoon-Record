package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_2156 {
	// 틀린 이유
	//  잔을 3잔 연속 마시는 것이 불가능하다고 했지만
	//  마지막 잔을 꼭 마셔야한다고 제시하지 않았었다
	//  즉 마지막 잔이 아니더라도 최대로 마신량일 수 있다는 가정을 못하고 있던 점이 틀린 이유이다
	
	// 입력
	//  첫째 줄에 포도주 잔의 개수 n이 주어진다. (1 ≤ n ≤ 10,000) 
	//  둘째 줄부터 n+1번째 줄까지 포도주 잔에 들어있는 포도주의 양이 순서대로 주어진다. 포도주의 양은 1,000 이하의 음이 아닌 정수이다.
	// 출력
	//	첫째 줄에 최대로 마실 수 있는 포도주의 양을 출력한다.
	static int dp[], arr[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp = new int [n + 1];
		arr = new int [n + 1];
		for (int i = 1; i < n + 1; i++) arr[i] = Integer.parseInt(br.readLine());
		dp[1] = arr[1];
		if (n >= 2) dp[2] = dp[1] + arr[2];
		solve(n);
		System.out.print(dp[n]);
	}
	
	static void solve(int n) {
		if (n > 2) for (int i = 3; i <= n; i++) {
			dp[i] = Math.max(dp[i - 3] + arr[i - 1], dp[i - 2]) + arr[i];
		}
	}
}
