package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Second_9015 {
	// 입력
	//	첫째 줄에 테스트케이스의 개수 T가 주어진다.
	// 	각 테스트케이스의 첫째 줄에는 점의 개수 N(4 ≤ n ≤ 3,000)이 주어지고, 이어서 N개의 줄에는 점의 x좌표와 y좌표가 주어진다.
	//	모든 좌표는 -10000 이상 +10000이하의 정수이다. 같은 위치의 점이 여러 번 주어지는 경우는 없다.
	// 출력
	//	첫째 줄에 지민이가 잘라낸 K×K 보드를 체스판으로 만들기 위해 다시 칠해야 하는 정사각형 개수의 최솟값을 출력한다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
	    for (int i = 0; i < t; i++) {
	    	int n = Integer.parseInt(br.readLine()), arr[][] = new int [n][2];
	    	Set<Location> set = new HashSet<>();
	    	for (int j = 0; j < n; j++) {
	    		StringTokenizer st = new StringTokenizer(br.readLine());
	    		int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
	    		set.add(new Location(x, y));
	    		arr[j][0] = x; arr[j][1] = y;
	    	}
	    	int ans = 0;
	    	for (int j = 0; j < n; j++) {
	    		int x1 = arr[j][0], y1 = arr[j][1];
	    		for (int k = j + 1; k < n; k++) {
	    			int x2 = arr[k][0], y2 = arr[k][1];
	    			int dx = x1 - x2, dy = y1 - y2, temp = dx * dx + dy * dy;
	    			if (ans >= temp) continue;
	    			Location loc1_1 = new Location(x1 + dy, y1 - dx);
	    			Location loc1_2 = new Location(x2 + dy, y2 - dx);
	    			Location loc2_1 = new Location(x1 - dy, y1 + dx);
	    			Location loc2_2 = new Location(x2 - dy, y2 + dx);
	    			if ((set.contains(loc1_1) && set.contains(loc1_2)) 
	    					|| (set.contains(loc2_1) && set.contains(loc2_2))) 
	    				ans = Math.max(ans, temp);
	    			
	    		}
	    	}
	    	sb.append(ans + "\n");
	    }
	    System.out.print(sb);
	}
}
class Location {
	Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
	int x;
	int y;
	
	@Override
	public boolean equals(Object location) {
		if (location instanceof Location) {
			return x == ((Location)location).x && y == ((Location)location).y;
		} else return false;
	}
	
	@Override
	public int hashCode() {
		if (x > 0 && y > 0) return 100000000 + x + y;
		else if (x > 0 && y <= 0) return 200000000 + x + y;
		else if (x <= 0 && y > 0) return 300000000 + x + y;
		else return 400000000 + x + y;
	}
}