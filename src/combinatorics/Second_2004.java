package combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Second_2004 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		long n = Long.parseLong(st.nextToken()), m = Long.parseLong(st.nextToken());
		long cnt = Math.min(five_power(n)-five_power(n-m)-five_power(m), two_power(n)-two_power(n-m)-two_power(m));
		System.out.print(cnt);
	}
	
	static long two_power(long num) {
		long cnt = 0;
		// 2 �� 5�� �Ҽ��̸� �Ҽ��� ��� ������ ���� �� �������� 1���� (���� ��-1)���� ���������� ����Ƿ�
		// num �� �Ҽ��� ������ num ���� num/2 ���� 2 �� ���� ������ ���� �� �� �ִ�
		while(num>=2) {
			cnt+=num/2;
			num/=2;
		}
		return cnt;
	}
	
	static long five_power(long num) {
		long cnt = 0;
		while(num>=5) {
			cnt+=num/5;
			num/=5;
		}
		return cnt;
	}
}