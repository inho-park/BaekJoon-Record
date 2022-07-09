package set;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class First_1764 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashSet<String> set = new HashSet<>();
		while(n --> 0) {
			set.add(br.readLine());
		}
		int ans=0;
		StringBuilder sb = new StringBuilder();
		ArrayList<String> list = new ArrayList<>();
		while(m --> 0) {
			String str = br.readLine();
			if (set.contains(str)) {
				ans++;
				list.add(str);
			}
		}
		
		Collections.sort(list);
		for (int i=0;i<list.size();i++) {
			sb.append(list.get(i)).append("\n");
		}
		
		System.out.println(ans);
		System.out.print(sb);
	}
}
