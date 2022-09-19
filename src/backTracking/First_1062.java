package backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_1062 {
	// Runtime 초과로 실패
	static int k, n, max;
	static String arr[];
	static boolean visited [] = new boolean [26];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken()); 
		max = -1;
		arr = new String [n];
		String str;
		if (k<5) System.out.print(0);
		else if (k==21) System.out.print(26);
		else {
			for (int i=0;i<n;i++) {
				str = br.readLine();
				arr[i] = str.substring(4,str.length()-4);
			}
			visited ['a'-'a'] = true;
			visited ['n'-'a'] = true;
			visited ['t'-'a'] = true;
			visited ['i'-'a'] = true;
			visited ['c'-'a'] = true;
			func(0);
			System.out.println(max);
			
		}
	}
	
	static void func(int start) {
		if (k-5==start) {
			int count=0;
			
			for (int i=0;i<n;i++) {
				boolean isVisited = true;
				for (int j=0;j<arr[i].length();j++) {
					if(!visited[arr[i].charAt(j)-'a']) {
						isVisited = false;
						break;
					}
				}
				if (isVisited) count++;
			}
			if (max<count) max=count;
			return;
		}
		
		for (int i=0;i<26;i++) {
			if (!visited[i]) {
				visited[i] = true;
				func(start+1);
				visited[i] = false;
			}
		}
	}
}