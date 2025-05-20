package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_2630 {
	// �Է�
	//	ù° �ٿ��� ��ü ������ �� ���� ���� N�� �־��� �ִ�. 
	// 	N�� 2, 4, 8, 16, 32, 64, 128 �� �ϳ��̴�. 
	//	�������� �� �������� ���簢��ĭ���� ���� ���ٺ��� ���ʷ� ��° �ٺ��� ������ �ٱ��� �־�����. 
	//	�Ͼ������ ĥ���� ĭ�� 0, �Ķ������� ĥ���� ĭ�� 1�� �־�����, �� ���� ���̿��� ��ĭ�� �ϳ��� �ִ�.
	// ���
	//	ù° �ٿ��� �߶��� ���� �������� ������ ����ϰ�, ��° �ٿ��� �Ķ��� �������� ������ ����Ѵ�.
	
	static int one = 0;
	static int zero = 0;
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
			else zero++;
			return;
		} else {
			n = n/2;
			recursion(n, row, col);
			recursion(n, row + n, col);
			recursion(n, row, col + n);
			recursion(n, row + n, col + n);
		}
	}
}