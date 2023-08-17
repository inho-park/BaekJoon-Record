package combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_1735 {

	// 입력
	//	첫째 줄에 N이 주어진다. (1 ≤ N ≤ 15)
		
	// 출력
	//	첫째 줄에 과정을 N번 거친 후 점의 수를 출력한다.

	// 틀린 이유
	/* 기약 분수를 완전히 잘못 파악하고 있었다
	 우선 내가 더해야하는 두 분수의 분모들을 가져와 최대공약수를 찾으려한 시도가 잘못됐다
	 당연히 두 값을 더한 분수의 분자와 분모의 최대공약수를 찾아야하는데 어처구니 없는 실수로 너무 오랜 시간을 잡았다 
	 */
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int num1 = Integer.parseInt(st.nextToken()), den1 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		int num2 = Integer.parseInt(st.nextToken()), den2 = Integer.parseInt(st.nextToken()); 
				
		int num = num1 * den2 + num2 * den1, den = den1 * den2, gcd = gcd(num, den);
		
		System.out.print(num / gcd + " " + den /gcd);
		br.close();
	}
	
	static int gcd(int num, int den) { 
		if (num % den == 0) return den;
		return gcd(den, num % den);
	}
}
