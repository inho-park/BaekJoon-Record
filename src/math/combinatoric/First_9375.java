package math.combinatoric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class First_9375 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		HashMap<String, Integer> map;
		String wearing;
		int n = Integer.parseInt(br.readLine()), m, ans;
		StringTokenizer st;
		while(n-->0) {
			map = new HashMap<>();
			m = Integer.parseInt(br.readLine());
			while(m-->0) {
				st = new StringTokenizer(br.readLine()," ");
				st.nextToken();
				wearing = st.nextToken();
				if (map.containsKey(wearing)) map.put(wearing, map.get(wearing)+1);
				else map.put(wearing, 1);
			}
			ans = 1;
			for (Map.Entry<String,Integer> entry : map.entrySet()) ans = ans*(entry.getValue()+1);
			
			sb.append(ans-1).append("\n");				
		}
		System.out.print(sb);
	}
}