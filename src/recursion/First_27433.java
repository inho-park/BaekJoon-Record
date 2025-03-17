package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_27433 {
	// 입력
	//	0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
	// 출력
	//	첫째 줄에 정수 N(0 ≤ N ≤ 20)이 주어진다
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.print(recursion(n));
	}
	
	static long recursion(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * recursion(n - 1);
		}
	}
}
