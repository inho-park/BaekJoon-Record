package backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_11053 {
	// 입력
	//	첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000)이 주어진다.
	//	둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ Ai ≤ 1,000)
	// 출력
	//	첫째 줄에 수열 A의 가장 긴 증가하는 부분 수열의 길이를 출력한다.
	static int n, arr[], dp[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine()); arr = new int [n]; dp = new int [n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) 
			arr[i] = Integer.parseInt(st.nextToken());
		int result = 0;
		for (int i = 0; i < n; i++) {
			dp[i] = 1;
			for (int j = i - 1; j >= 0; j--)
				if (arr[i] > arr[j]) dp[i] = Math.max(dp[i], dp[j] + 1);
			result = Math.max(result, dp[i]);
		}
		System.out.print(dp[n - 1]);
	}
}