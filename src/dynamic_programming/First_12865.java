package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_12865 {
	// �Է�
	//	ù �ٿ� ��ǰ�� �� N(1 �� N �� 100)�� �ؼ��� ��ƿ �� �ִ� ���� K(1 �� K �� 100,000)�� �־�����. 
	//	�� ��° �ٺ��� N���� �ٿ� ���� �� ������ ���� W(1 �� W �� 100,000)�� �ش� ������ ��ġ V(0 �� V �� 1,000)�� �־�����.
	//	�Է����� �־����� ��� ���� �����̴�.
	// ���
	//	�� �ٿ� �賶�� ���� �� �ִ� ���ǵ��� ��ġ���� �ִ��� ����Ѵ�.
	
	static int n, k, arr [][];
	static Integer dp [][];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		arr = new int [n][2];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		dp = new Integer [n][k + 1];
		
		System.out.print(lcs(n - 1, k));
	}
	
	static int lcs(int row, int w) {
		if (row < 0) return 0;
		
		if (dp[row][w] == null) {

			if (arr[row][0] > w) dp[row][w] = lcs(row - 1, w);
			else dp[row][w] = Math.max(lcs(row - 1, w), lcs(row - 1, w - arr[row][0]) + arr[row][1]);
		}
		
		return dp[row][w];
	}
}