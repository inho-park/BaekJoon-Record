package math.combinatoric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_11050 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()),ans=1;
		for (int i =1;i<a+1;i++) {
			ans*=i;
		}
		for (int i = 1;i<b+1;i++) {
			ans/=i;
		}
		for (int i = 1;i<a-b+1;i++) {
			ans/=i;
		}
		System.out.print(ans);
	}
}