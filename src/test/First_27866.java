package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_27866 {
	// 입력
	//	첫째 줄에 영어 소문자와 대문자로만 이루어진 단어 S가 주어진다. 단어의 길이는 최대 1,000$이다.
	//	둘째 줄에 정수 i가 주어진다. (1 <= i <= |S|)
	// 출력
	//	S의 i번째 글자를 출력한다.
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char [] arr = br.readLine().toCharArray();
		System.out.print(arr[Integer.parseInt(br.readLine()) - 1]);
	}
}
