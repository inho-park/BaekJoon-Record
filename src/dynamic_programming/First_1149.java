	package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_1149 {
	// �Է�
	//  ù° �ٿ� ���� �� N(2 �� N �� 1,000)�� �־�����. 
	//  ��° �ٺ��� N���� �ٿ��� �� ���� ����, �ʷ�, �Ķ����� ĥ�ϴ� ����� 1�� ������ �� �ٿ� �ϳ��� �־�����. 
	//  ���� ĥ�ϴ� ����� 1,000���� �۰ų� ���� �ڿ����̴�.
	// ���
	//	ù° �ٿ� ��� ���� ĥ�ϴ� ����� �ּڰ��� ����Ѵ�.
	static int dp[][], arr[][];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int [n][3];
		dp = new int [n][3];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = Integer.parseInt(st.nextToken());
		}
		dp[0][0] = arr[0][0];
		dp[0][1] = arr[0][1];
		dp[0][2] = arr[0][2];
		
		System.out.print(Math.min(solve(n - 1, 0), Math.min(solve(n - 1, 1), solve(n - 1, 2))));
	}
	
	
	public static int solve(int n, int color) { 
		if (dp[n][color] == 0) {
			if (color == 0) {
				dp[n][0] = Math.min(solve(n - 1, 1), solve(n - 1, 2)) + arr[n][0];
			}
			
			else if (color == 1) {
				dp[n][1] = Math.min(solve(n - 1, 0), solve(n - 1, 2)) + arr[n][1];
			}
			
			else {
				dp[n][2] = Math.min(solve(n - 1, 0), solve(n - 1, 1)) + arr[n][2];
			}
		}
		return dp[n][color];
	}
}
