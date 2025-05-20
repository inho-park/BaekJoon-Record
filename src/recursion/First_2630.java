package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_2630 {
	// 입력
	//	첫째 줄에는 전체 종이의 한 변의 길이 N이 주어져 있다. 
	// 	N은 2, 4, 8, 16, 32, 64, 128 중 하나이다. 
	//	색종이의 각 가로줄의 정사각형칸들의 색이 윗줄부터 차례로 둘째 줄부터 마지막 줄까지 주어진다. 
	//	하얀색으로 칠해진 칸은 0, 파란색으로 칠해진 칸은 1로 주어지며, 각 숫자 사이에는 빈칸이 하나씩 있다.
	// 출력
	//	첫째 줄에는 잘라진 햐얀색 색종이의 개수를 출력하고, 둘째 줄에는 파란색 색종이의 개수를 출력한다.
	
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