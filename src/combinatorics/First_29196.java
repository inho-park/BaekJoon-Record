package combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_29196 {
	// 부분 정답
	// 조건에 맞게 쓴 것 같지만 내가 모르는 부분이 있는 것 같음
	
	// 입력
	//	첫 번째 줄에 소수 k가 주어진다.
	// 출력
	//	첫 번째 줄에 조건을 만족하는 분수가 존재한다면 YES, 아니라면 NO를 출력한다.
	//	만약 그러한 분수가 존재한다면, 두 번째 줄에 두 정수 p, q를 공백을 사이에 두고 출력한다.
	//	정답이 여러 개 존재한다면 그중 아무거나 출력해도 상관없다.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
//		double k = Double.parseDouble(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), ".");
		st.nextToken();
		
		int a = Integer.parseInt(st.nextToken()), b;
		if (a <= 10) b = 10;
		else if (a <= 100) b = 100;
		else if (a <= 1000) b = 1000;
		else if (a <= 10000) b = 10000;
		else if (a <= 100000) b = 100000;
		else if (a <= 1000000) b = 1000000;
		else if (a <= 10000000) b = 10000000;
		else b = 100000000;
		
		System.out.println("YES");
		System.out.print(a + " " + b);
	}
}
