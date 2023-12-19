package backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_14889 {
	// 입력
	//	첫째 줄에 N(4 ≤ N ≤ 20, N은 짝수)이 주어진다. 둘째 줄부터 N개의 줄에 S가 주어진다. 
	//	각 줄은 N개의 수로 이루어져 있고, i번 줄의 j번째 수는 Sij 이다. 
	//	Sii는 항상 0이고, 나머지 Sij는 1보다 크거나 같고, 100보다 작거나 같은 정수이다.
	// 출력
	//	첫째 줄에 스타트 팀과 링크 팀의 능력치의 차이의 최솟값을 출력한다.
	static int n, arr[][], result = Integer.MAX_VALUE;
	static boolean visit[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine()); arr = new int [n][n]; visit = new boolean [n];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < n; j++) 
				arr[i][j] += Integer.parseInt(st.nextToken());
		}
		
		solve(0, 0);
		System.out.print(result);
	}
	
	
	static void solve(int idx, int cnt) {
		if (cnt == n/2) {
			int a = 0, b = 0;
			
			for (int i = 0; i < n - 1; i++) 
				for (int j = i + 1; j < n; j++) {
					if (visit[i] == true && visit[j] == true) {
						a += arr[i][j];
						a += arr[j][i];
					}
					else if (visit[i] == false && visit[j] == false) {
						b += arr[i][j];
						b += arr[j][i];
					}
				}
			int temp;
			if ((temp = a - b) == 0) {
				System.out.print(0);
				System.exit(0);
			} else result = Math.min(result, Math.abs(temp));
			
			return;
		}
		
		for (int i = idx; i < n; i++) {
			if (!visit[i]) {
				visit[i] = true;
				solve(i + 1, cnt + 1);
				visit[i] = false;				
			}
		}
	}
}