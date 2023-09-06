package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_2579 {
	// �Է�
	//  �Է��� ù° �ٿ� ����� ������ �־�����.
	//	��° �ٺ��� �� �ٿ� �ϳ��� ���� �Ʒ��� ���� ��ܺ��� ������� �� ��ܿ� ���� �ִ� ������ �־�����. 
	//  ����� ������ 300������ �ڿ����̰�, ��ܿ� ���� �ִ� ������ 10,000������ �ڿ����̴�.
	// ���
	//	ù° �ٿ� ��� ������ ���ӿ��� ���� �� �ִ� �� ������ �ִ��� ����Ѵ�.
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

