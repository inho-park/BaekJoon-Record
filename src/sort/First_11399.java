package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class First_11399 {
	// �Է�
	//	ù° �ٿ� ����� �� N(1 �� N �� 1,000)�� �־�����. ��° �ٿ��� �� ����� ���� �����ϴµ� �ɸ��� �ð� Pi�� �־�����. (1 �� Pi �� 1,000)
	// ���
	//	ù° �ٿ� �� ����� ���� �����ϴµ� �ʿ��� �ð��� ���� �ּڰ��� ����Ѵ�.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int arr [] = new int [n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int answer = 0, temp = 0;
		for (int i = 0; i < n; i++) {
			temp += arr[i];
			answer += temp;
		}
		System.out.print(answer);
	}
}