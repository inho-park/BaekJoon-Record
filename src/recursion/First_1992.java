package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_1992 {
	// �Է�
	//	ù° �ٿ� N(1 �� N �� 3^7, N�� 3^k ��)�� �־�����. ���� N���� �ٿ��� N���� ������ ����� �־�����.
	// ���
	//	ù° �ٿ� -1�θ� ä���� ������ ������, ��° �ٿ� 0���θ� ä���� ������ ������, ��° �ٿ� 1�θ� ä���� ������ ������ ����Ѵ�.
	
	static String str = "";
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
		System.out.print(str);
	}
	
	static void recursion(int n, int row, int col) {
		if (checkColor(n, row, col)) {
			if (arr[row][col] == 1) str += "1";
			else str += "0";
		} else {
			str += "(";
			n = n/2;
			recursion(n, row, col);
			recursion(n, row, col + n);
			recursion(n, row + n, col);
			recursion(n, row + n, col + n);
			str += ")";
		}
	}
	
	static boolean checkColor(int n, int row, int col) {
		int color = arr[row][col];
		boolean isColorSame = true;
		for (int i = row; i < row + n; i++)
			for (int j = col; j < col + n; j++)
				if (arr[i][j] != color) {
					isColorSame = false;
					break;
				}
		return isColorSame;
	}
}