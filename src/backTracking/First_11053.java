package backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_11053 {
	// �Է�
	//	ù° �ٿ� ���� A�� ũ�� N (1 �� N �� 1,000)�� �־�����.
	//	��° �ٿ��� ���� A�� �̷�� �ִ� Ai�� �־�����. (1 �� Ai �� 1,000)
	// ���
	//	ù° �ٿ� ���� A�� ���� �� �����ϴ� �κ� ������ ���̸� ����Ѵ�.
	static int n, arr[], dp[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine()); arr = new int [n]; dp = new int [n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) 
			arr[i] = Integer.parseInt(st.nextToken());
		int result = 0;
		for (int i = 0; i < n; i++) {
			dp[i] = 1;
			for (int j = i - 1; j >= 0; j--)
				if (arr[i] > arr[j]) dp[i] = Math.max(dp[i], dp[j] + 1);
			result = Math.max(result, dp[i]);
		}
		System.out.print(dp[n - 1]);
	}
}