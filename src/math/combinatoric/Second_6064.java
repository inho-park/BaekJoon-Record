package math.combinatoric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Second_6064 {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine()),lcm,m,n,x,y;
		StringTokenizer st;
		for (int i=0;i<count;i++) {
			st = new StringTokenizer(br.readLine()," ");
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			x = Integer.parseInt(st.nextToken())-1;
			y = Integer.parseInt(st.nextToken())-1;
			boolean flag = false;
			for (int j=x;j<m*n;j+=m) {
				if(j%n==y) {
					sb.append(j+1).append("\n");
					flag = true;
					break;
				}
			}
			if (!flag) sb.append(-1).append("\n");
		}
		System.out.print(sb);
	}
}