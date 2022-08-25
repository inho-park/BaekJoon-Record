package backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Second_15651 {
	// dfs (depth first search) 구조의 backtracking 활용
	static int arr [], n, m;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken()); 
		m = Integer.parseInt(st.nextToken());
		arr = new int [m];
		dfs(1,0);
		System.out.print(sb);
	}
	static void dfs(int k,int depth) {
		if(depth == m) {
			for (int i:arr) {
				sb.append(i+" ");
			}
			sb.append("\n");
			return;
		}
		
		for (int i=k;i<=n;i++) {
			arr[depth] = i;
			dfs(k,depth+1);
		}
	}
}