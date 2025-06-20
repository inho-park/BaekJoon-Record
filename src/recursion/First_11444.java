package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_11444 {
	// 입력
	//	첫째 줄에 n이 주어진다. n은 1,000,000,000,000,000,000보다 작거나 같은 자연수이다.
	// 출력
	//	첫째 줄에 n번째 피보나치 수를 1,000,000,007으로 나눈 나머지를 출력한다.
	// 느낀 점
	//	만약 분할 정복을 할 수 있을 것 같지 않은 문제들에 재귀함수 활용의 그림이 보인다면 행렬로 점화하는 방향도 고려하기
	static long n;
	final static long ARR [][] = {{1, 1}, {1, 0}}, MOD = 1000000007;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Long.parseLong(br.readLine());
		long fn [][] = {{1, 1}, {1, 0}};
		System.out.println(pow(fn, n - 1)[0][0]);
	}
	
	static long[][] pow(long [][] fn, long k) {
		if (k == 0 || k == 1) return fn;
		
		long ret [][] = pow(fn, k/2);
		
		ret = multifly(ret, ret);
		
		if (k % 2 == 1) {
			ret = multifly(ret, ARR);
		}
		
		return ret;
	}
	
	static long[][] multifly(long [][] ret1, long [][] ret2) {
		long [][] ret = new long [ret1.length][ret2[0].length];
		
		for (int i = 0; i < ret.length; i++) {
			for (int j = 0; j < ret[0].length; j++) {
				for (int k = 0; k < ret2.length; k++) {
					ret[i][j] += (ret1[i][k] * ret2[k][j]);
					ret[i][j] %= MOD;
				}
			}
		}
		return ret;
	}
}