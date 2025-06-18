package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_9251 {
	// 입력
	//	첫째 줄과 둘째 줄에 두 문자열이 주어진다. 문자열은 알파벳 대문자로만 이루어져 있으며, 최대 1000글자로 이루어져 있다. 
	// 출력
	//	첫째 줄에 입력으로 주어진 두 문자열의 LCS의 길이를 출력한다.
	
	static char arr1 [];
	static char arr2 [];
	static Integer dp [][];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		arr1 = br.readLine().toCharArray();
		arr2 = br.readLine().toCharArray();
		dp = new Integer [arr1.length][arr2.length];
		
		System.out.print(lcs(arr1.length - 1, arr2.length - 1));
	}
	
	static int lcs(int idx1, int idx2) {
		if (idx1 == -1 || idx2 == -1) return 0;
		
		if (dp[idx1][idx2] == null) {
			dp[idx1][idx2] = 0;

			if (arr1[idx1] == arr2[idx2]) dp[idx1][idx2] = lcs(idx1 - 1, idx2 - 1) + 1;
			else dp[idx1][idx2] = Math.max(lcs(idx1 - 1, idx2), lcs(idx1, idx2 - 1));
		}
		
		return dp[idx1][idx2];
	}
}