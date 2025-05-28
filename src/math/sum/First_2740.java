package math.sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_2740 {
	// �Է�
	//	ù° �ٿ� ��� A�� ũ�� N �� M�� �־�����. ��° �ٺ��� N���� �ٿ� ��� A�� ���� M���� ������� �־�����. 
	//	�� ���� �ٿ��� ��� B�� ũ�� M�� K�� �־�����. �̾ M���� �ٿ� ��� B�� ���� K���� ���ʴ�� �־�����. 
	//	N�� M, �׸��� K�� 100���� �۰ų� ����, ����� ���Ҵ� ������ 100���� �۰ų� ���� �����̴�.
	// ���
	//	ù° �ٺ��� N���� �ٿ� ��� A�� B�� ���� ����� ����Ѵ�. ����� �� ���Ҵ� �������� �����Ѵ�.
	
	static int n;
	static int m;
	static int k;
	
	static int arr1 [][];
	static int arr2 [][];
	static int result [][];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr1 = new int [n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < m; j++) {
				arr1[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		st.nextToken();
		k = Integer.parseInt(st.nextToken());
		arr2 = new int [m][k];
		result = new int [n][k];
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < k; j++) {
				arr2[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < k; j++) {
				int sum = 0;
				for(int x = 0; x < m; x++) {
					sum += arr1[i][x] * arr2[x][j];
				}
				sb.append(sum).append(' ');
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
