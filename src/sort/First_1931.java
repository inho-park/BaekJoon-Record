package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// Activity selection problem �˰��� ����

public class First_1931 {
	// �Է�
	//	ù° �ٿ� ȸ���� �� N(1 �� N �� 100,000)�� �־�����. 
	//	��° �ٺ��� N+1 �ٱ��� �� ȸ���� ������ �־����µ� �̰��� ������ ���̿� �ΰ� ȸ���� ���۽ð��� ������ �ð��� �־�����. 
	//	���� �ð��� ������ �ð��� 2^31-1���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.
	// ���
	//	ù° �ٿ� �ִ� ����� �� �ִ� ȸ���� �ִ� ������ ����Ѵ�.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int [][] arr = new int [n][2];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[1]==o2[1] ? o1[0]-o2[0] : o1[1]-o2[1];
			}
		});
		
		int finish = 0, cnt = 0;
		
		// ���� ����
		// 1. ����ð��� �������� �������� ����
		// 2. ���۽ð��� �������� �������� ����
		for (int i = 0; i < arr.length; i++) {
			if (finish <= arr[i][0]) {
				finish = arr[i][1];
				cnt++;
			}
		}
		
		System.out.print(cnt);
	}
}