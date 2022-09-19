package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_10216 {
	// 뭐가 문젠지는 잘 모르겠으니ㅏ 결국엔 dfs 를 써야할것 같다는 느낌이 강하게 왔음
	static int arr [][];
	static boolean visited [];
	static int cnt, n, m;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		while(n-->0) {
			m = Integer.parseInt(br.readLine());
			arr = new int [m][3];
			for (int i=0;i<m;i++) {
				cnt = m;
				visited = new boolean [m];
				StringTokenizer st = new StringTokenizer(br.readLine()," ");
				arr[i][0] = Integer.parseInt(st.nextToken());
				arr[i][1] = Integer.parseInt(st.nextToken());
				arr[i][2] = Integer.parseInt(st.nextToken());
			}
			for (int i=0;i<m-1;i++) {
				if (!visited[i]) counting(i);
			}
			sb.append(cnt).append("\n");
			cnt = 0;
		}
		System.out.print(sb);
	}
	
	static void counting(int idx) {
		int x , y , r;
		for (int i=0;i<m;i++) {
			if (idx == i) continue;
			else {
				x = (arr[idx][0]-arr[i][0])*(arr[idx][0]-arr[i][0]);
				y = (arr[idx][1]-arr[i][1])*(arr[idx][1]-arr[i][1]);
				r = (arr[idx][2] + arr[i][2])*(arr[idx][2] + arr[i][2]);
				if (x+y<=r) {
					visited[i] = true;
					cnt--;
				}
			}
		}
	}
}
