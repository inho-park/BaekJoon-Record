package binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_2805 {
	// �Է�
	//	ù° �ٿ� ������ �� N�� ����̰� ������ ���������� �ϴ� ������ ���� M�� �־�����. (1 �� N �� 1,000,000, 1 �� M �� 2,000,000,000)
	//	��° �ٿ��� ������ ���̰� �־�����. ������ ������ ���� �׻� M���� ũ�ų� ���� ������, ����̴� ���� �ʿ��� ������ �׻� ������ �� �ִ�. 
	//	���̴� 1,000,000,000���� �۰ų� ���� ���� ���� �Ǵ� 0�̴�.
	// ���
	//	��� M������ ������ ���� �������� ���ؼ� ���ܱ⿡ ������ �� �ִ� ������ �ִ��� ����Ѵ�.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int arr [] = new int [n];
		long max = 0;
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
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
				if (arr[i] > mid) count += (arr[i] - mid);
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