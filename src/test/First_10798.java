package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_10798 {
	// 입력
	//	총 다섯줄의 입력이 주어진다. 각 줄에는 최소 1개, 최대 15개의 글자들이 빈칸 없이 연속으로 주어진다. 
	//	주어지는 글자는 영어 대문자 ‘A’부터 ‘Z’, 영어 소문자 ‘a’부터 ‘z’, 숫자 ‘0’부터 ‘9’ 중 하나이다. 
	//	각 줄의 시작과 마지막에 빈칸은 없다.
	// 출력
	//	영석이가 세로로 읽은 순서대로 글자들을 출력한다. 이때, 글자들을 공백 없이 연속해서 출력한다. 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char [][] arr = new char [5][15];
		int top = -1;
		for (int i = 0; i < 5; i++) {
			char [] chArr = br.readLine().toCharArray();
			if (top < chArr.length) top = chArr.length;
			for (int j = 0; j < chArr.length; j++) {
				arr[i][j] = chArr[j];
			}
		}
		String str = "";
		for (int i = 0; i < top; i++) {
			for (int j = 0; j < 5; j++) {
				if (arr[j][i] != 'a' - 'a')
				str += arr[j][i];
			}
		}
		
		System.out.print(str);
	}
}