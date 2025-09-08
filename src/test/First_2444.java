package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_2444 {
	// 입력
	//	첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
	// 출력
	//	첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int j = n - 1 - i; j > 0; j--) {
				sb.append(" ");
			}
			for (int j = 0; j <= i; j++) {
				sb.append("*");
			}
			for (int j = 1; j <= i; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				sb.append(" ");
			}
			for (int j = n - 1 - i; j > 0; j--) {
				sb.append("*");
			}
			for (int j = n - 2 - i; j > 0; j--) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}