package binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_1654 {
	// �Է�
	//	ù° �ٿ��� �������� �̹� ������ �ִ� ������ ���� K, �׸��� �ʿ��� ������ ���� N�� �Էµȴ�. 
	//	K�� 1�̻� 10,000������ �����̰�, N�� 1�̻� 1,000,000������ �����̴�. �׸��� �׻� K <= N �̴�. 
	//	�� �� K�ٿ� ���� �̹� ������ �ִ� �� ������ ���̰� ��Ƽ���� ������ ������ �Էµȴ�. ������ ���̴� 2^(31-1)���� �۰ų� ���� �ڿ����̴�.
	// ���
	//	ù° �ٿ� N���� ���� �� �ִ� ������ �ִ� ���̸� ��Ƽ���� ������ ������ ����Ѵ�.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int arr [] = new int [n];
		
		long max = 0;
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		max++; 
		long min = 0; 
		long mid = 0; 
 
		while (min < max) { 
			mid = (max + min) / 2;
			long count = 0;
			
			for (int i = 0; i < n; i++) {
				count += (arr[i] / mid);
			}
			if(count < m) {
				max = mid;
			}
			else {
				min = mid + 1;
			}
		}
		
		System.out.print(min - 1);
	}
}