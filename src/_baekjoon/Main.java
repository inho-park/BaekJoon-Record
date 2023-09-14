package _baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	// �Է�
	//  ù° �ٿ� ������ ���� ���� n�� �־�����. (1 �� n �� 10,000) 
	//  ��° �ٺ��� n+1��° �ٱ��� ������ �ܿ� ����ִ� �������� ���� ������� �־�����. �������� ���� 1,000 ������ ���� �ƴ� �����̴�.
	// ���
	//	ù° �ٿ� �ִ�� ���� �� �ִ� �������� ���� ����Ѵ�.
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
