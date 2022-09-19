package geometry.ccw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_17387 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		long x1,y1,x2,y2,x3,y3,x4,y4;
		x1 = Integer.parseInt(st.nextToken());
		y1 = Integer.parseInt(st.nextToken());
		x2 = Integer.parseInt(st.nextToken());
		y2 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine()," ");
		x3 = Integer.parseInt(st.nextToken());
		y3 = Integer.parseInt(st.nextToken());
		x4 = Integer.parseInt(st.nextToken());
		y4 = Integer.parseInt(st.nextToken());
		if (ccw(x1,y1,x2,y2,x3,y3)*ccw(x1,y1,x2,y2,x4,y4)<=0&&
				ccw(x3,y3,x4,y4,x1,y1)*ccw(x3,y3,x4,y4,x2,y2)<=0){
			if (ccw(x1,y1,x2,y2,x3,y3)*ccw(x1,y1,x2,y2,x4,y4)==0&&
					ccw(x3,y3,x4,y4,x1,y1)*ccw(x3,y3,x4,y4,x2,y2)==0) {
				if (isPos(x1,y1,x2,y2,x3,y3,x4,y4)) System.out.println("1");
				else System.out.println("0");
			}
			else System.out.println("1");
		}
		else System.out.println("0");
	}
	
	static long ccw(long x1, long y1, long x2, long y2, long x3, long y3) {
		long temp = (x2-x1)*(y3-y1)-(x3-x1)*(y2-y1);
		if (temp>0) return 1;
		else if (temp == 0) return 0;
		else return -1;
	}
	static boolean isPos(long x1, long y1, long x2, long y2, long x3, long y3, long x4, long y4) {
		return Math.min(x1, x2) <= Math.max(x3, x4) && Math.min(x3, x4) <= Math.max(x1, x2)
				&& Math.min(y1, y2) <= Math.max(y3, y4) && Math.min(y3, y4) <= Math.max(y1, y2);
	}
}