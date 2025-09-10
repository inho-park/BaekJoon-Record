package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_20944 {
	// 입력
	//	다음과 같이 입력이 주어진다. N
	// 출력
	//	길이가 N이고 알파벳 소문자로 이루어진, 수미상관이면서 팰린드롬인 문자열을 출력한다. 
	//	항상 그러한 문자열은 존재하고, 만약 여러 가지가 있다면 그중 하나를 출력한다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n/2; i++) {
			sb.append("a");
		}
		if (n%2 == 1) sb.append("b");
		for (int i = 0; i < n/2; i++) {
			sb.append("a");
		}
		System.out.print(sb);
	}
}