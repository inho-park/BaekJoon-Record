package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_2156 {
	// Ʋ�� ����
	//  ���� 3�� ���� ���ô� ���� �Ұ����ϴٰ� ������
	//  ������ ���� �� ���ž��Ѵٰ� �������� �ʾҾ���
	//  �� ������ ���� �ƴϴ��� �ִ�� ���ŷ��� �� �ִٴ� ������ ���ϰ� �ִ� ���� Ʋ�� �����̴�
	
	// �Է�
	//  ù° �ٿ� ������ ���� ���� n�� �־�����. (1 �� n �� 10,000) 
	//  ��° �ٺ��� n+1��° �ٱ��� ������ �ܿ� ����ִ� �������� ���� ������� �־�����. �������� ���� 1,000 ������ ���� �ƴ� �����̴�.
	// ���
	//	ù° �ٿ� �ִ�� ���� �� �ִ� �������� ���� ����Ѵ�.
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
