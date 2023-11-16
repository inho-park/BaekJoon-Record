package math.combinatoric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_6064 {
	static int m,n,x,y,ans=0;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i=0;i<count;i++) {
			st = new StringTokenizer(br.readLine()," ");
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			getYear(getLCM());
			ans = 0;
		}
		System.out.print(sb);
	}
	
	static int getLCM() {
		int a = m;
		int b = n;
		int r;
		while(b!=0) {
			r = a%b;
			a = b;
			b = r;
		}
		return m*n/a;
	}
	
	static void getYear(int lcm) {
		int M=0,N=0;
		while(ans!=lcm) {
			M++;
			N++;
			ans++;
			if (M==x&&N==y) {
				sb.append(ans).append("\n");
				return;
			}
			else if (M==m+1 && N!=n+1) M=1;
			else if (M!=m+1 && N==n+1) N=1;
		}
		sb.append(-1).append("\n");
	}
}