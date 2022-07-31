package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_1004 {

	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int ans = 0;
		for (int i = 0; i<n;i++) {
			st = new StringTokenizer(br.readLine());
			int x1,y1,x2,y2;
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int k  = Integer.parseInt(st.nextToken());
			for (int j = 0; j<k;j++) {
				st = new StringTokenizer(br.readLine());
				int cx = Integer.parseInt(st.nextToken());
				int cy = Integer.parseInt(st.nextToken());
				int r  = Integer.parseInt(st.nextToken());
				double len1 = Math.sqrt((x1-cx)*(x1-cx)+(y1-cy)*(y1-cy));
				double len2 = Math.sqrt((x2-cx)*(x2-cx)+(y2-cy)*(y2-cy));
				if (len1<=r && len2>r) ans++;
				else if (len1>r && len2<=r) ans++;
				else continue;
			}
			sb.append(ans).append("\n");
			ans=0;
		}
		System.out.print(sb);
	}
}