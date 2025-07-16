package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_24416 {
	// 입력
	//	첫째 줄에 n(5 ≤ n ≤ 40)이 주어진다.
	// 출력
	//	코드1 코드2 실행 횟수를 한 줄에 출력한다.
	static int dp [], rcs_cnt = 1, dp_cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        recursion(n);
        dp = new int [n];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < n; i++) {
        	dp_cnt++;
        	dp[i] = dp[i - 1] + dp[i - 2];
        }
        
        System.out.print(rcs_cnt + " " + dp_cnt);
    }
    
    static int recursion(int i) {
    	if (i == 2 || i == 1) {
    		return 1;
    	} else {    		
    		rcs_cnt++;
    		return recursion(i - 1) + recursion(i - 2);
    	}
    }
}
