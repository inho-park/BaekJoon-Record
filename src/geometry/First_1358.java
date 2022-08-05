package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_1358 {

	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		int ans = 0;
		for (int i=0;i<p;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			
			if (x<=x1 && x1<=x+w) {
				if((x<=x1 && x1<=x+w) && (y<=y1 && y1<=y+h)) ans++;
			}
			else if (x1<x) {
				if((x-x1)*(x-x1)+(y+h/2-y1)*(y+h/2-y1)<=(h/2)*(h/2)) ans++;
			}
			else {
				if((x+w-x1)*(x+w-x1)+(y+h/2-y1)*(y+h/2-y1)<=(h/2)*(h/2)) ans++;
			}
		}
		System.out.print(ans);		
	}
}
