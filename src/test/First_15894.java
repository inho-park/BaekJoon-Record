package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_15894 {
	// 입력
	//	첫 번째 줄에 가장 아랫부분의 정사각형 개수 n이 주어진다. (1 ≤ n ≤ 10^9)
	// 출력
	//	첫 번째 줄에 형석이가 말해야 하는 답을 출력한다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(Long.parseLong(br.readLine()) * 4);
	}
}