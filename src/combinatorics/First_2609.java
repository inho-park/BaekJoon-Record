package combinatorics;

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
		int gcf,lcm; //greatest common factor, least common multiple
		if(a>b) {
			while(true) {
				gcf = a%b;
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
				gcf = b%a;
				if (gcf==0) {
					gcf = a;
					break;
				}
				b = a;
				a = gcf;
			}
		}
		lcm = A*B/gcf;
		System.out.println(gcf);
		System.out.print(lcm);
	}
}