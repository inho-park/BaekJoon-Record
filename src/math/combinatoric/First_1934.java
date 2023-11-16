package math.combinatoric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_1934 {


	public static void main(String[] args) throws IOException{	
		// Euclidean algorithm
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int a,b,A,B,gcf;
		for (int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine()," ");
			a = Integer.parseInt(st.nextToken());
			A = a;
			b = Integer.parseInt(st.nextToken());
			B = b;
			if (a>b) {
				while(true) {
					gcf = a % b;
					if (gcf==0) {
						gcf = b;
						break;
					}
					a = b;
					b = gcf;
				}
			}
			else {
				while(true) {
					gcf = b % a;
					if (gcf==0) {
						gcf = a;
						break;
					}
					b = a;
					a = gcf;
				}
			}
			sb.append(A*B/gcf).append("\n");
		}
		System.out.print(sb);
	}
}