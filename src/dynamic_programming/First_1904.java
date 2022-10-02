package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_1904 {
	static int dp [];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        dp = new int [n+1];
        dp[0] = 1;
        dp[1] = 2;

        System.out.print(Lalala(n));
    }

    static int Lalala(int n) {
        if (dp[n-1]==0) dp[n-1] = (Lalala(n-1)+Lalala(n-2))%15746;
        return dp[n-1];
    }
}
