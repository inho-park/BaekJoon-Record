package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_3009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int [] loc1 = { Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
		st = new StringTokenizer(br.readLine(), " ");
		int [] loc2 = { Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
		st = new StringTokenizer(br.readLine(), " ");
		int [] loc3 = { Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
		int x,y;
		if (loc1[0]==loc2[0]) {
			x=loc3[0];
			if (loc1[1]==loc3[1]) y=loc2[1];
			else y=loc1[1];
		}
		else {
			if (loc1[0]==loc3[0]) x=loc2[0];
			else x=loc1[0];
			if (loc1[1]==loc2[1]) y=loc3[1];
			else {
				if (loc1[1]==loc3[1]) y=loc2[1];
				else y=loc1[1];
			}
		}
		System.out.print(x+" "+y);
	}
}