package backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_2580 {
	// sudoku 의 첫번 째 조건문에서 계속 작동이 멈추지만 그 이유를 모르겠음
	static StringBuilder sb = new StringBuilder();
	static int arr [][] = new int [9][9];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for (int i=0;i<9;i++) {
			st = new StringTokenizer(br.readLine()," ");
			for (int j=0;j<9;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		sudoku(0,0);
		
	}
	static void sudoku(int row, int col) {
		if (arr[row][col]==0) {
			// i 값이 8 까지 가므로 다른 조건문인 col==9 인 경우나 row==9 인 경우의 연산이 불가능하다
			for (int i=1;i<=9;i++) {
				if (x_possibility(row,col,i)&&y_possibility(row,col,i)&&square_possibility(row,col,i)) {
					arr[row][col] = i;
					sudoku(row,col+1);
				}
			}
			arr[row][col] = 0;
			return;
		}
		
		if (col == 9) sudoku(row+1,col);
		
		if (row == 9) {
			for (int i=0;i<row;i++) {
				for (int j=0;j<9;j++) {
					sb.append(arr[i][j]+" ");
				}
				sb.append("\n");
			}
			System.out.print(sb);
			return;
			// 시스템을 강제로 종료시킴
			// System.exit(0);
		}
		
		sudoku(row,col+1);
	}
	
	static boolean x_possibility(int row, int col, int n) {
		for (int i=0;i<9;i++) 
			if (arr[row][i]==n) return false;
		
		return true;
	}
	
	static boolean y_possibility(int row, int col, int n) {
		for (int i=0;i<9;i++) 
			if (arr[i][col]==n) return false;
		
		return true;
	}
	
	static boolean square_possibility(int row, int col, int n) {
		int s_row = row/3*3;
		int s_col = col/3*3;
		
		for (int i=s_row;i<s_row+3;i++)
			for (int j=s_col;j<s_col+3;j++)
				if (arr[i][j]==n) return false;
		
		return true;
	}
}