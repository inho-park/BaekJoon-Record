package combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_13909 {
	// �Է�
	//	ù ��° �ٿ��� â���� ������ ����� �� N(1 �� N �� 2,100,000,000)�� �־�����.
	// ���
	//	�������� ���� �ִ� â���� ������ ����Ѵ�.
	// Ʋ�� ����
		/* �޸� �ʰ�
		 �ش� ������ �ܼ� boolean �迭�� �ذ��Ϸ��� �ϴ� ������ ������� �޸� �ʰ��� Ʋ�� ���̴�
		 ���Ƿ� �����ִ� â���� ������ ���غ��� ������ ������ ������ â���� ������ ���� Ȯ���� �� �ִ�
		111
		101
		100
		
		111111
		101010
		100011
		100111
		100101
		100100
		
		111111111
		101010101
		100011100
		100111110
		100101110
		100100110
		100100010
		100100000
		100100001
		 */
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), cnt = 0;
		boolean arr [] = new boolean [n + 1];
		for (int i = 1; i < n + 1; i++) {
			for (int j = i; j < n + 1; j = j+i) {
				arr[j] = !arr[j];
			}
		}
		for(boolean i : arr) if (i) cnt++;
		System.out.print(cnt);
	}
}