package _baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	// 입력
	//  첫째 줄에 포도주 잔의 개수 n이 주어진다. (1 ≤ n ≤ 10,000) 
	//  둘째 줄부터 n+1번째 줄까지 포도주 잔에 들어있는 포도주의 양이 순서대로 주어진다. 포도주의 양은 1,000 이하의 음이 아닌 정수이다.
	// 출력
	//	첫째 줄에 최대로 마실 수 있는 포도주의 양을 출력한다.
	static int[] dp, arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp = new int[n + 1];
		arr = new int[n + 1];
		for(int i = 1; i < n + 1; i++) arr[i] = Integer.parseInt(br.readLine());
		dp[1] = arr[1];
		if (n > 1) dp[2] = arr[1] + arr[2]; 

		System.out.println(solve(n));
	}
	
	static int solve(int n) {
		
		if(n > 2) {
			dp[n] = Math.max(Math.max(solve(n - 2), solve(n - 3) + arr[n - 1]) + arr[n], solve(n - 1));
		}
		
		return dp[n];
	}
}
