package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_11401 {
	// 입력
	//	첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 4,000,000, 0 ≤ K ≤ N)
	// 출력
	//	binom{N}{K}를 1,000,000,007로 나눈 나머지를 출력한다.
	
	// 실패 원인 : 시간초과
	// n, k에 대한 이항 계수를 F(n, k)라 봤을 때, F(n, k) = F(n - 1, k - 1) + F(n, k - 1)인 특성을 반영했더니, 
	// n 과 k 가 특정 상황일 때 재귀 함수 사용이 너무 많아져서 실행속도 저하 Ex) n = 4000000, k = 2000000
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		System.out.print(recursion(n, k));
	}
	
	static long recursion(int n, int k) {
		if (n < k) return 0;
		if (k == 1 || n - k == 1) {
			return n;
		}
		else if (k == 0 || n == k) {
			return 1;
		}
		
		long temp = recursion(n - 1, k);
		long temp2 = recursion(n - 1, k - 1);
		if (temp + temp2 > 1000000007) return (temp + temp2) % 1000000007;
		else return temp + temp2;
	}
}