package math.combinatoric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_5086 {

	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int a,b,i=1;
		while(true) {
			st = new StringTokenizer(br.readLine()," ");
			a = Integer.parseInt(st.nextToken()); 
			b = Integer.parseInt(st.nextToken());
			if (a>b) {
				while(true) {
					if(b*i==a) {
						sb.append("multiple").append("\n");
						break;
					}
					else if(b*i>a) {
						sb.append("neither").append("\n");
						break;
					}
					i++;
				}
			}
			else if(a==0 && b==0) break;
			else {
				while(true) {
					if(a*i==b) {
						sb.append("factor").append("\n");
						break;
					}
					else if(a*i>b) {
						sb.append("neither").append("\n");
						break;
					}
					i++;
				}
			i=1;
			}
		}
		System.out.print(sb);
	}
}
