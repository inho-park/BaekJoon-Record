package math.sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_11659 {
	// �Է�
	//	ù° �ٿ� ���� ���� N�� ���� ���ؾ� �ϴ� Ƚ�� M�� �־�����. ��° �ٿ��� N���� ���� �־�����. 
	//	���� 1,000���� �۰ų� ���� �ڿ����̴�. ��° �ٺ��� M���� �ٿ��� ���� ���ؾ� �ϴ� ���� i�� j�� �־�����.
	// ���
	//	�� M���� �ٿ� �Է����� �־��� i��° ������ j��° ������ ���� ����Ѵ�.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		int arr[] = new int [n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int I = Integer.parseInt(st.nextToken()), J = Integer.parseInt(st.nextToken()),
					result = arr[J] - arr[I -1];
			sb.append(result + "\n");
			result = 0;
		}
		System.out.print(sb);
	}
}
