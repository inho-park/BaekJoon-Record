package _baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	// 입력
	//	첫째 줄에 수열 A의 크기 N이 주어지고, 둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ N ≤ 1,000, 1 ≤ Ai ≤ 1,000)
	// 출력
	//	첫째 줄에 수열 A의 부분 수열 중에서 가장 긴 바이토닉 수열의 길이를 출력한다.	
	static int N, arr[], dp_l[], dp_r[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int [N]; dp_l = new int [N]; dp_r = new int [N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		for (int i = 0; i < N; i++) {
			lis(i); lds(i);
		}
		int result = 0;
		for (int i = 0; i < N; i++) result = Math.max(result, dp_l[i] + dp_r[i]);
		System.out.print(result - 1);
	}
	
	static int lis(int n) {
		if (dp_l[n] == 0) {
			dp_l[n] = 1;
			
			for (int i = n - 1; i >= 0; i--) {
				if (arr[i] < arr[n]) dp_l[n] = Math.max(dp_l[n], lis(i) + 1);
			}
		}
		
		return dp_l[n];
	}
	
	static int lds(int n) {
		if (dp_r[n] == 0) {
			dp_r[n] = 1;
			
			for (int i = n + 1; i < dp_r.length; i++) {
				if (arr[i] < arr[n]) dp_r[n] = Math.max(dp_r[n], lds(i) + 1);
			}
		}
		return dp_r[n];
	}
}