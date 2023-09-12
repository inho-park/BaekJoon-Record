package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_10844 {
	// 틀린 이유
	// 해당 값이 4Byte 를 넘어가는 범위의 숫자가 들어올 수 있으나 이에 대한 대처 없이 
	// int 형 변수를 사용하여 값이 음수로 나옴
	
	// 입력
	//  첫째 줄에 1보다 크거나 같고, 100보다 작거나 같은 정수 N이 주어진다.
	// 출력
	//	첫째 줄에 정답을 1,000,000,000으로 나눈 나머지를 출력한다.
	static int dp[][];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), result = 0, div = 1000000000;
		dp = new int [n + 1][10];
		for (int i = 1; i < 10; i++) dp[1][i] = 1;
		
		for (int i = 2; i <= n; i++)
			for (int j = 0; j < 10; j++) {
				if (j == 0) dp[i][j] = dp[i - 1][j + 1] % div;
				else if (j == 9) dp[i][j] = dp[i - 1][j - 1] % div;
				else dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % div;
			}
		
		for (int i = 0; i < 10; i++) result += dp[n][i];
		System.out.print(result % div);
	}
}
