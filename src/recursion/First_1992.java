package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_1992 {
	// 입력
	//	첫째 줄에는 영상의 크기를 나타내는 숫자 N 이 주어진다. 
	//	N 은 언제나 2의 제곱수로 주어지며, 1 ≤ N ≤ 64의 범위를 가진다. 
	// 	두 번째 줄부터는 길이 N의 문자열이 N개 들어온다. 각 문자열은 0 또는 1의 숫자로 이루어져 있으며, 영상의 각 점들을 나타낸다.
	// 출력
	//	영상을 압축한 결과를 출력한다.
	
	static String str = "";
	static int [][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int [n][n];
		for (int i = 0; i < n; i++) {			
			char [] charArr = br.readLine().toCharArray();
			for (int j = 0; j < n; j++) {
				arr[i][j] = (int)charArr[j] - '0';
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