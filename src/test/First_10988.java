package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_10988 {
	// 입력
	//	첫째 줄에 단어가 주어진다. 단어의 길이는 1보다 크거나 같고, 100보다 작거나 같으며, 알파벳 소문자로만 이루어져 있다.
	// 출력
	//	첫째 줄에 팰린드롬이면 1, 아니면 0을 출력한다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char [] arr = br.readLine().toCharArray();
		for (int i = 0; i < arr.length/2; i++) {
			if (arr[i] != arr[arr.length - 1 - i]) {
				System.out.print(0);
				System.exit(0);
			}
		}
		System.out.print(1);
	}
}