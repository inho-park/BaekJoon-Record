package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_24416 {
	// �Է�
	//	ù° �ٿ� n(5 �� n �� 40)�� �־�����.
	// ���
	//	�ڵ�1 �ڵ�2 ���� Ƚ���� �� �ٿ� ����Ѵ�.
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
