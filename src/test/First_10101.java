package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_10101 {
	// 입력
	//	총 3개의 줄에 걸쳐 삼각형의 각의 크기가 주어진다. 모든 정수는 0보다 크고, 180보다 작다.
	// 출력
	//	문제의 설명에 따라 Equilateral, Isosceles, Scalene, Error 중 하나를 출력한다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		if (a + b + c == 180) {
			if (a == b) {
				if (b == c) System.out.print("Equilateral");
				else System.out.print("Isosceles");
			} else {
				if (b == c) System.out.print("Isosceles");
				else { 
					if (a == c) System.out.print("Isosceles");
					else System.out.print("Scalene");
				
				}
			}
		} else System.out.print("Error");
	}
}