package _baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	// 입력
	//	첫째 줄에 N과 M이 주어진다. (1 ≤ N ≤ 106, 2 ≤ M ≤ 103)
	//	둘째 줄에 N개의 수 A1, A2, ..., AN이 주어진다. (0 ≤ Ai ≤ 109)
	// 출력
	//	첫째 줄에 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수를 출력한다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()); 
	    long nums[] = new long [n + 1], result = 0, mods[] = new long [m];
	    st = new StringTokenizer(br.readLine(), " ");
	    for (int i = 1; i <= n; i++) {
	    	nums[i] = (nums[i - 1] + Integer.parseInt(st.nextToken())) % m;
	    	if (nums[i] == 0) result++;
	    	mods[(int)nums[i]]++;
	    }
	    for (int i = 0; i < m; i++) 
	    	if (mods[i] > 1) 
	    		result += (mods[i] * (mods[i] - 1) /2);
	    
	    System.out.print(result);
	}
}