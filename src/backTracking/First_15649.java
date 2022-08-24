package backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_15649 {
	// dfs (depth first search) 구조의 backtracking 활용
	static int arr [];
	static boolean bool [];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()),depth=0;
		arr = new int [m];
		bool = new boolean [n];
		dfs(n,m,depth);
	}
	static void dfs(int n,int m,int depth) {
		if(depth == m) {
			for (int i:arr) {
				System.out.print(i+" ");
			}
			System.out.println();
			return;
		}
		
		for (int i=0;i<n;i++) {
			if (bool[i]==false) {
				bool[i]=true;
				arr[depth] = i+1;
				dfs(n, m, depth+1);
				bool[i] = false;
			}
		}
	}
}