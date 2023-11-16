package math.combinatoric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Second_13909 {
	// 입력
	//	첫 번째 줄에는 창문의 개수와 사람의 수 N(1 ≤ N ≤ 2,100,000,000)이 주어진다.
	// 출력
	//	마지막에 열려 있는 창문의 개수를 출력한다.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println((int)Math.sqrt(Integer.parseInt(br.readLine())));
	}
}
