package math.sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Firsst_10986 {
	// 입력
		//	첫째 줄에 N과 M이 주어진다. (1 ≤ N ≤ 106, 2 ≤ M ≤ 103)
		//	둘째 줄에 N개의 수 A1, A2, ..., AN이 주어진다. (0 ≤ Ai ≤ 109)
		// 출력
		//	첫째 줄에 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수를 출력한다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()),result = 0;
	    boolean dp[][] = new boolean [n+1][n+1];
	    int nums[] = new int [n + 1];
	    st = new StringTokenizer(br.readLine(), " ");
	    for (int i = 1; i <= n; i++) nums[i] = nums[i - 1] + Integer.parseInt(st.nextToken());
	    for (int i = 1; i <= n; i++) {
	    	for (int j = 0; j < i; j++) {
	    		if ((nums[i] - nums[j])%m == 0) dp[i][j + 1] = true;
	    	}
	    }
	    for (boolean []arr: dp)
	    	for (boolean mod: arr)
	    		if (mod) result++;
	    
	    System.out.print(result);
	}
}