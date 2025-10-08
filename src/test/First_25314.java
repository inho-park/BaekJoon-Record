package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_25314 {
	// 입력
	//	첫 번째 줄에는 문제의 정수 N이 주어진다. (4 <= N <= 1,000; N은 4의 배수) 
	// 출력
	//	혜아가 N바이트 정수까지 저장할 수 있다고 생각하는 정수 자료형의 이름을 출력하여라.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = "";
		for (int i = 0; i < n/4; i++) {
			 str+="long ";
		}
		System.out.print(str + "int");
	}
}
