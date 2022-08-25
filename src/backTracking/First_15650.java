package backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_15650 {
	// dfs (depth first search) 구조의 backtracking 활용
	static int arr [], n, m;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken()); 
		m = Integer.parseInt(st.nextToken());
		arr = new int [m];
		dfs(1,0);
	}
	static void dfs(int k,int depth) {
		if(depth == m) {
			for (int i:arr) {
				System.out.print(i+" ");
			}
			System.out.println();
			return;
		}
		
		for (int i=k;i<=n;i++) {
			arr[depth] = i;
			dfs(i+1,depth+1);
		}
	}
}	