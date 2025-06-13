package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class First_2565 {
	// �Է�
	//	ù° �ٿ��� �� ������ ������ �������� ������ �־�����. �������� ������ 100 ������ �ڿ����̴�. 
	//	��° �ٺ��� �� �ٿ� �ϳ��� �������� A������� ����Ǵ� ��ġ�� ��ȣ�� B������� ����Ǵ� ��ġ�� ��ȣ�� ���ʷ� �־�����. 
	//	��ġ�� ��ȣ�� 500 ������ �ڿ����̰�, ���� ��ġ�� �� �� �̻��� �������� ����� �� ����.
	// ���
	//	ù° �ٿ� �����ִ� ��� �������� ���� �������� �ʰ� �ϱ� ���� ���־� �ϴ� �������� �ּ� ������ ����Ѵ�.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int [][] arr = new int [n][2];
		int [] dp = new int [n];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<int []>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[0] - o2[0];
			}
		});
		
		for (int i = 0; i < n; i++) {
			dp[i] = 1;
			
			for (int j = 0; j < i; j++) {
				if (arr[i][1] > arr[j][1]) {
					dp[i] = Math.max(dp[i],  dp[j] + 1);
				}
			}
		}
		
		int max = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(max,  dp[i]);
		}
		
		System.out.print(n - max);
	}
}