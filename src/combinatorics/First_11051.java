package combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_11051 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		System.out.print(factorial(n)*mod_inverse(factorial(k)*factorial(n-k)%10007,10007-2)%10007);
	}
	
	static int factorial(int n) { 
		if(n<=1) return 1;
		return n*(factorial(n-1))%10007;
	}
	
	static int mod_inverse(int a,int p) {
		int inverse=1;
		while(p>0) {
			if(p%2==1) {
				inverse *= a;
				inverse %= 10007;
				p--;
			}
			a *= a;
			a %= 10007;
			p >>= 1;
		}
		return inverse;
	}
}