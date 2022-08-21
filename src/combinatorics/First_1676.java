package combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class First_1676 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()), cnt = 0;
		BigInteger factorial = BigInteger.ONE;
		for (int i=n;i>1;i--) {
			factorial = factorial.multiply(new BigInteger(String.valueOf(i)));			
		}
		String ans = factorial.toString();
		char [] arr = ans.toCharArray();
		for (int i=arr.length-1;i>0;i--) {
			if (arr[i]=='0') cnt++;
			else break;
		}
		System.out.print(cnt);
	}
}