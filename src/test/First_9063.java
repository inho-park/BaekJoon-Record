package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_9063 {
	// 입력
	//	첫째 줄에는 점의 개수 N (1 ≤ N ≤ 100,000) 이 주어진다. 
	//	이어지는 N 줄에는 각 점의 좌표가 두 개의 정수로 한 줄에 하나씩 주어진다. 각각의 좌표는 -10,000 이상 10,000 이하의 정수이다. 
	// 출력
	//	첫째 줄에 N 개의 점을 둘러싸는 최소 크기의 직사각형의 넓이를 출력하시오. 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int maxRow = Integer.MIN_VALUE;
		int maxCol = Integer.MIN_VALUE;
		int minRow = Integer.MAX_VALUE;
		int minCol = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int row = Integer.parseInt(st.nextToken());
			int col = Integer.parseInt(st.nextToken());
			if (row > maxRow) maxRow = row;
			if (row < minRow) minRow = row;
			if (col > maxCol) maxCol = col;
			if (col < minCol) minCol = col;
		}
		System.out.print((maxRow - minRow) * (maxCol - minCol));
	}
}