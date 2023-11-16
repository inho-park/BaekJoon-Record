package math.combinatoric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_2609 {

	public static void main(String[] args) throws IOException{	
		// Euclidean algorithm
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int A = a, B = b;
		int gcd,lcm; //greatest common factor, least common multiple
		if(a>b) {
			while(true) {
				gcd = a%b;
				if (gcd==0) {
					gcd = b;
					break;
				}
				a = b;
				b = gcd;
			}
		}
		else {
			while(true) {
				gcd = b%a;
				if (gcd==0) {
					gcd = a;
					break;
				}
				b = a;
				a = gcd;
			}
		}
		lcm = A*B/gcd;
		System.out.println(gcd);
		System.out.print(lcm);
	}
}