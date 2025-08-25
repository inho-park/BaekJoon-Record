package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_27323 {
	// 입력
	//	표준 입력에 다음과 같은 형태로 입력이 주어진다.
	//	A
	//	B
	// 출력
	//	세로 길이가 A cm, 가로 길이가 B cm인 직사각형의 넓이를 cm2 단위로 구하고, 단위 (cm2)를 생략하여 출력한다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()));
	}
}