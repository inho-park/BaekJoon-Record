package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_25501 {
	// 입력
	//	첫째 줄에 테스트케이스의 개수 T가 주어진다. (1 <= T <= 1000)
	//	둘째 줄부터 T개의 줄에 알파벳 대문자로 구성된 문자열 S가 주어진다. (1 <= |S| <= 1000)
	// 출력
	//	각 테스트케이스마다, isPalindrome 함수의 반환값과 recursion 함수의 호출 횟수를 한 줄에 공백으로 구분하여 출력한다.
	static int cnt = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			System.out.println(isPalindrome(s) + " " + cnt);
			cnt = 0;
		}
		
	}
	
	static int recursion(String s, int l, int r) {
		cnt++;
		if (l >= r) {
			return 1;
		} else if (s.charAt(l) != s.charAt(r)) {
			return 0;
		} else {
			return recursion(s, l+1, r-1);
		}
	}
	
	static int isPalindrome(String s) {
		return recursion(s, 0, s.length() - 1);
	}
}
