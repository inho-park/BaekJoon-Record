package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_1932 {
	// 입력
	//  첫째 줄에 삼각형의 크기 n(1 ≤ n ≤ 500)이 주어지고, 둘째 줄부터 n+1번째 줄까지 정수 삼각형이 주어진다.
	// 출력
	//	첫째 줄에 합이 최대가 되는 경로에 있는 수의 합을 출력한다.
	static int dp[][], arr[][], n, max = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		dp = new int [n][n];
		arr = new int [n][n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < i + 1; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 0; i < n; i++) dp[n-1][i] = arr[n-1][i];
		
		System.out.print(solve(0, 0));
	}
	
	
	public static int solve(int x, int y) {
		if (dp[x][y] == 0 && x != n - 1) {
			dp[x][y] = Math.max(solve(x + 1, y), solve(x + 1, y + 1)) + arr[x][y];
		}
		return dp[x][y];
	}
}