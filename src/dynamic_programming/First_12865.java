package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_12865 {
	// 입력
	//	첫 줄에 물품의 수 N(1 ≤ N ≤ 100)과 준서가 버틸 수 있는 무게 K(1 ≤ K ≤ 100,000)가 주어진다. 
	//	두 번째 줄부터 N개의 줄에 거쳐 각 물건의 무게 W(1 ≤ W ≤ 100,000)와 해당 물건의 가치 V(0 ≤ V ≤ 1,000)가 주어진다.
	//	입력으로 주어지는 모든 수는 정수이다.
	// 출력
	//	한 줄에 배낭에 넣을 수 있는 물건들의 가치합의 최댓값을 출력한다.
	
	static int n, k, arr [][];
	static Integer dp [][];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		arr = new int [n][2];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		dp = new Integer [n][k + 1];
		
		System.out.print(lcs(n - 1, k));
	}
	
	static int lcs(int row, int w) {
		if (row < 0) return 0;
		
		if (dp[row][w] == null) {

			if (arr[row][0] > w) dp[row][w] = lcs(row - 1, w);
			else dp[row][w] = Math.max(lcs(row - 1, w), lcs(row - 1, w - arr[row][0]) + arr[row][1]);
		}
		
		return dp[row][w];
	}
}