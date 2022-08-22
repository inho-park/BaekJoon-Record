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
		// 2 와 5는 소수이며 소수로 어떠한 정수를 나눌 때 나머지는 1부터 (나눈 값-1)까지 순차적으로 생기므로
		// num 을 소수로 나누면 num 부터 num/2 까지 2 의 승을 가지는 수를 알 수 있다
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