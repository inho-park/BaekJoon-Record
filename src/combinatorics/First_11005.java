package combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_11005 {
	// 입력
	// 10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.
	// 10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
		
	// 출력
	// 첫째 줄에 10진법 수 N을 B진법으로 출력한다.

		static int n, b, temp;
		static String result = "";
		
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			n = Integer.parseInt(st.nextToken()); b = Integer.parseInt(st.nextToken());
			recursion();
			char charArr [] = result.toCharArray();
			for (int i = charArr.length - 1; i >= 0; i--) System.out.print(charArr[i]);
		}

		static void recursion() {
			if (n == 0) return;
			else {
				temp = n % b;
				n /= b;
				if (temp < 10) result += temp;
				else result += (char)(temp + 55);
				recursion();
			}
		}
	}
