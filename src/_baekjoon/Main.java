package _baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	// �Է�
	//	ù° �ٿ� ���� A�� ũ�� N�� �־�����, ��° �ٿ��� ���� A�� �̷�� �ִ� Ai�� �־�����. (1 �� N �� 1,000, 1 �� Ai �� 1,000)
	// ���
	//	ù° �ٿ� ���� A�� �κ� ���� �߿��� ���� �� ������� ������ ���̸� ����Ѵ�.	
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