package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_10810 {
	// �Է�
	//	ù° �ٿ� N (1 �� N �� 100)�� M (1 �� M �� 100)�� �־�����.
	//	��° �ٺ��� M���� �ٿ� ���ļ� ���� �ִ� ����� �־�����. �� ����� �� ���� i j k�� �̷���� ������, 
	//	i�� �ٱ��Ϻ��� j�� �ٱ��ϱ����� k�� ��ȣ�� ������ �ִ� ���� �ִ´ٴ� ���̴�. 
	//	���� ���, 2 5 6�� 2�� �ٱ��Ϻ��� 5�� �ٱ��ϱ����� 6�� ���� �ִ´ٴ� ���̴�. (1 �� i �� j �� N, 1 �� k �� N)
	//	�����̴� �Է����� �־��� ������� ���� �ִ´�.
	// ���
	//	1�� �ٱ��Ϻ��� N�� �ٱ��Ͽ� ����ִ� ���� ��ȣ�� �������� ������ ����Ѵ�. ���� ������� ���� �ٱ��ϴ� 0�� ����Ѵ�.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int [] arr = new int [n + 1];
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			for (int j = a; j <= b; j++) {				
				arr[j] = k;
			}
		}
		String str = "";
		for (int i = 1; i < n; i++) {
			str += arr[i] + " ";
		}
		str += arr[n];
		System.out.print(str);
	}
}
