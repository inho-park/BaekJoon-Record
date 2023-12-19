package backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_14889 {
	// �Է�
	//	ù° �ٿ� N(4 �� N �� 20, N�� ¦��)�� �־�����. ��° �ٺ��� N���� �ٿ� S�� �־�����. 
	//	�� ���� N���� ���� �̷���� �ְ�, i�� ���� j��° ���� Sij �̴�. 
	//	Sii�� �׻� 0�̰�, ������ Sij�� 1���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
	// ���
	//	ù° �ٿ� ��ŸƮ ���� ��ũ ���� �ɷ�ġ�� ������ �ּڰ��� ����Ѵ�.
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