package math.sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_11660 {
	// 입력
	//	첫째 줄에 표의 크기 N과 합을 구해야 하는 횟수 M이 주어진다. 
	//	(1 ≤ N ≤ 1024, 1 ≤ M ≤ 100,000) 둘째 줄부터 N개의 줄에는 표에 채워져 있는 수가 1행부터 차례대로 주어진다. 
	//	다음 M개의 줄에는 네 개의 정수 x1, y1, x2, y2 가 주어지며, (x1, y1)부터 (x2, y2)의 합을 구해 출력해야 한다. 
	//	표에 채워져 있는 수는 1,000보다 작거나 같은 자연수이다. (x1 ≤ x2, y1 ≤ y2)
	// 출력
	//	총 M줄에 걸쳐 (x1, y1)부터 (x2, y2)까지 합을 구해 출력한다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    StringBuilder sb = new StringBuilder();
	    int n = Integer.parseInt(st.nextToken());
	    int m = Integer.parseInt(st.nextToken());
	    int[][] dp = new int[n+1][n+1];
	    for (int i = 1; i <= n; i++) {
	        st = new StringTokenizer(br.readLine());
	        for (int j = 1; j <= n; j++) {
	            dp[i][j] = dp[i][j-1] + Integer.parseInt(st.nextToken());
	        }
	    }
	    for (int k = 1; k <= m; k++) {
	        int sum = 0;
	        st = new StringTokenizer(br.readLine());
	        int x1 = Integer.parseInt(st.nextToken());
	        int y1 = Integer.parseInt(st.nextToken());
	        int x2 = Integer.parseInt(st.nextToken());
	        int y2 = Integer.parseInt(st.nextToken());
	        for (int i = x1; i <= x2; i++) {
	            sum = sum + (dp[i][y2] - dp[i][y1-1]);
	        }
	        sb.append(sum + "\n");
	    }
	    System.out.print(sb);
	}
}
