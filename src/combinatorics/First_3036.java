package combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_3036 {

	public static void main(String[] args) throws IOException{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int first = Integer.parseInt(st.nextToken()), second , gcd;
		for (int i=1;i<n;i++) {
			second = Integer.parseInt(st.nextToken());
			gcd = getGcd(first,second);
			sb.append(first/gcd+"/"+second/gcd).append("\n");
		}
		System.out.print(sb);
	}
	
	
	static int getGcd(int a, int b) {
		while(b!=0) {
			int r = a%b;
			a = b;
			b = r;
		}
		return a;
	}
}