package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_9184 {
	static int dp [][][] = new int [21][21][21];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] abc;
        int a,b,c;
        while(true){
            abc = br.readLine().split(" ");
            a = Integer.parseInt(abc[0]); b = Integer.parseInt(abc[1]); c = Integer.parseInt(abc[2]);
            if (a==-1 && b==-1 && c==-1) System.exit(0);
            System.out.printf("w(%d, %d, %d) = %d\n",a,b,c,w(a,b,c));
        }

    }

    static int w (int a, int b, int c) {
        if (a>0 && a<=20 && b>0 && b<=20 && c>0 && c<=20 && dp[a][b][c] != 0) return dp[a][b][c];

        if (a<=0 || b<=0 || c<=0) return 1;

        else if (a>20 || b>20 || c>20) {
            return dp[20][20][20] = w(20, 20, 20);
        }


        else if (a<b && b<c) return dp[a][b][c] = w(a,b,c-1) + w(a,b-1,c-1) - w(a,b-1,c);

        else return dp[a][b][c] = w(a-1,b,c) + w(a-1,b-1,c) + w(a-1,b,c-1) - w(a-1,b-1,c-1);
    }
}