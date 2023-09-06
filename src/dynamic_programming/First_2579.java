package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_2579 {
	// 입력
	//  입력의 첫째 줄에 계단의 개수가 주어진다.
	//	둘째 줄부터 한 줄에 하나씩 제일 아래에 놓인 계단부터 순서대로 각 계단에 쓰여 있는 점수가 주어진다. 
	//  계단의 개수는 300이하의 자연수이고, 계단에 쓰여 있는 점수는 10,000이하의 자연수이다.
	// 출력
	//	첫째 줄에 계단 오르기 게임에서 얻을 수 있는 총 점수의 최댓값을 출력한다.
	static int dp[], arr[], n;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		dp = new int [n];
		arr = new int [n];
		for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());
		dp[0] = arr[0];
		if (n >=2 ) dp[1] = arr[1] + dp[0];
		if (n >=3 ) dp[2] = Math.max(arr[0], arr[1]) + arr[2];
		System.out.print(solve(n - 1));
	}
	
	
	public static int solve(int i) {
		if (dp[i] == 0 && i > 2) dp[i] = Math.max(solve(i - 2), solve(i - 3) + arr[i - 1]) + arr[i];
		return dp[i];
	}
}

