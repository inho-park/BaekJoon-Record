package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_2720 {
	// 입력
	//	첫째 줄에 테스트 케이스의 개수 T가 주어진다. 
	//	각 테스트 케이스는 거스름돈 C를 나타내는 정수 하나로 이루어져 있다. C의 단위는 센트이다. (1달러 = 100센트) (1<=C<=500)
	// 출력
	//	각 테스트케이스에 대해 필요한 쿼터의 개수, 다임의 개수, 니켈의 개수, 페니의 개수를 공백으로 구분하여 출력한다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int quarter = n / 25;
			int dime = (n - quarter * 25) / 10;
			int nickel = (n - quarter * 25 - dime * 10) / 5;
			int penny = n - quarter * 25 - dime * 10 - nickel * 5;
			System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
		}
	}
}