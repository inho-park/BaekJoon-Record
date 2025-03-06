package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_25501 {
	// �Է�
	//	ù° �ٿ� �׽�Ʈ���̽��� ���� T�� �־�����. (1 <= T <= 1000)
	//	��° �ٺ��� T���� �ٿ� ���ĺ� �빮�ڷ� ������ ���ڿ� S�� �־�����. (1 <= |S| <= 1000)
	// ���
	//	�� �׽�Ʈ���̽�����, isPalindrome �Լ��� ��ȯ���� recursion �Լ��� ȣ�� Ƚ���� �� �ٿ� �������� �����Ͽ� ����Ѵ�.
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
