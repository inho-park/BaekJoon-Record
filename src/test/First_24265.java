package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_24265 {
	// 입력
	//	첫째 줄에 입력의 크기 n(1 ≤ n ≤ 500,000)이 주어진다.
	// 출력
	//	첫째 줄에 코드1 의 수행 횟수를 출력한다.
	//	둘째 줄에 코드1의 수행 횟수를 다항식으로 나타내었을 때, 최고차항의 차수를 출력한다. 
	//	단, 다항식으로 나타낼 수 없거나 최고차항의 차수가 3보다 크면 4를 출력한다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Integer.parseInt(br.readLine());
		System.out.println(n * (n - 1) / 2);
		System.out.print(2);
	}
}