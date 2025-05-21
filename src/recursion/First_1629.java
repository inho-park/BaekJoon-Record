package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_1629 {
	// 입력
	//	첫째 줄에 A, B, C가 빈 칸을 사이에 두고 순서대로 주어진다. A, B, C는 모두 2,147,483,647 이하의 자연수이다.
	// 출력
	//	첫째 줄에 A를 B번 곱한 수를 C로 나눈 나머지를 출력한다.
	
	static long c;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		c = Long.parseLong(st.nextToken());
		
		System.out.print(recursion(a, b));
	}
	
	static long recursion(long n, long k) {
		if (k == 1) {
			return n % c;
		}
		
		long mod = recursion(n, k/2);
		if (k % 2 == 1) {
			return (mod * mod % c) * n % c;
		}
		
		return mod * mod % c;
	}
}