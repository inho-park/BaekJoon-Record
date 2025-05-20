package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_1780 {
	// �Է�
	//	ù° �ٿ��� ������ ũ�⸦ ��Ÿ���� ���� N �� �־�����. 
	//	N �� ������ 2�� �������� �־�����, 1 �� N �� 64�� ������ ������. 
	// 	�� ��° �ٺ��ʹ� ���� N�� ���ڿ��� N�� ���´�. �� ���ڿ��� 0 �Ǵ� 1�� ���ڷ� �̷���� ������, ������ �� ������ ��Ÿ����.
	// ���
	//	������ ������ ����� ����Ѵ�.
	
	static int one = 0;
	static int zero = 0;
	static int oneMinus = 0;
	static int [][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int [n][n];
		for (int i = 0; i < n; i++) {			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		recursion(n, 0, 0);
		System.out.println(oneMinus);
		System.out.println(zero);
		System.out.print(one);
	}
	
	static void recursion(int n, int row, int col) {
		int color = arr[row][col];
		boolean isColorSame = true;
		for (int i = row; i < row + n; i++)
			for (int j = col; j < col + n; j++)
				if (arr[i][j] != color) {
					isColorSame = false;
					break;
				}
		if (isColorSame) {
			if (color == 1) one++;
			else if (color == -1) oneMinus++;
			else zero++;
			return;
		} else {
			n = n/3;
			recursion(n, row, col);
			recursion(n, row, col + n);
			recursion(n, row, col + n * 2);
			recursion(n, row + n, col);
			recursion(n, row + n, col + n);
			recursion(n, row + n, col + n * 2);
			recursion(n, row + n * 2, col);
			recursion(n, row + n * 2, col + n);
			recursion(n, row + n * 2, col + n * 2);
		}
	}
}