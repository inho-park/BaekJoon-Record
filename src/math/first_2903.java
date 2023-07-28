package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class first_2903 {
	// 입력
	//	첫째 줄과 둘째 줄에, 각 분수의 분자와 분모를 뜻하는 두 개의 자연수가 순서대로 주어진다. 입력되는 네 자연수는 모두 30,000 이하이다.
		
	// 출력
	//	첫째 줄에 구하고자 하는 기약분수의 분자와 분모를 뜻하는 두 개의 자연수를 빈 칸을 사이에 두고 순서대로 출력한다.
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = (Integer.parseInt(br.readLine())), temp = 2;
		for (int i = 1; i <= n; i++) temp += (temp - 1);
		System.out.print(temp * temp);
	}
	
}
