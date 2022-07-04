package set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class First_14425 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		HashSet<String> set = new HashSet<>();
		for (int i=0;i<n;i++) {
			set.add(br.readLine());
		}
		int ans=0;
		for (int i=0;i<m;i++) {
			if (set.contains(br.readLine())) ans++;
		}
		System.out.print(ans);
	}

}
