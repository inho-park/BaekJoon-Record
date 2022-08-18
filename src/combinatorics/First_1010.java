package combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_1010 {

	public static void main(String[] args) throws IOException {
		// dynamic programming bottom-up
		int dp [][] = new int[30][30];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st ;
		int n = Integer.parseInt(br.readLine()),east,west;
		for (int i=0;i<30;i++) {
			dp[i][i]=1;
			dp[i][0]=1;
		}
		for (int i=2;i<30;i++) {
			for (int j=1;j<30;j++) {
				dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
			}
		}
		for (int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine()," ");
			east = Integer.parseInt(st.nextToken());
			west = Integer.parseInt(st.nextToken());
			sb.append(dp[west][east]).append("\n");
		}
		System.out.print(sb);
	}
}