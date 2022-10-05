package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_9461 {
	static long dp [] = new long [101];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());

        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 2;
        while(n-->0){
            int m = Integer.parseInt(br.readLine());
            System.out.println(Lalala(m));

        }
    }

    static long Lalala(int n) {
        if (dp[n] == 0) return dp[n] = Lalala(n - 1) + Lalala(n - 5);
        return dp[n];
    }
}