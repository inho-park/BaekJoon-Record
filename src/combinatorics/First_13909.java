package combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_13909 {
	// 입력
	//	첫 번째 줄에는 창문의 개수와 사람의 수 N(1 ≤ N ≤ 2,100,000,000)이 주어진다.
	// 출력
	//	마지막에 열려 있는 창문의 개수를 출력한다.
	// 틀린 이유
		/* 메모리 초과
		 해당 문제를 단순 boolean 배열로 해결하려고 하는 나같은 사람들은 메모리 초과로 틀릴 것이다
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
