package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_5597 {
	// 입력
	//	입력은 총 28줄로 각 제출자(학생)의 출석번호 n(1 ≤ n ≤ 30)가 한 줄에 하나씩 주어진다. 출석번호에 중복은 없다.
	// 출력
	//	출력은 2줄이다. 1번째 줄엔 제출하지 않은 학생의 출석번호 중 가장 작은 것을 출력하고, 2번째 줄에선 그 다음 출석번호를 출력한다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr [] = new int [31];
		
		for (int i = 0; i < 28; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		String str = "";
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == 0) str += i + "\n";
		}
		System.out.print(str);
	}
}
