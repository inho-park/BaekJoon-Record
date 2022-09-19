package backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Second_1062 {
	// 내가 짠 코드의 문제는 크게 2가지였다
	// 1
	// idx 와 start 를 따로 분류하여 앞파벳을 탐색할 때 i 를 idx 로 초기화하면 시간을 더 단축시킬 수 있고 start 를 증가시키면서
	// 반복문에서 return 하여 벗어나는 구조인데 이를 생각하지 못함
	// 2
	// 진짜 어이없는 실수
	// k == 26 이면 n 을 출력해야하는데 왜 26이라 썼는지 지금도 모르겠음
	static int k, n, max=0;
	static String arr[];
	static boolean visited [] = new boolean [26];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken()); 
		arr = new String [n];
		String str;
		if (k<5) System.out.print(0);
		else if (k==26) System.out.print(n);
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
			func(0,0);
			System.out.println(max);
		}
	}
	
	static void func(int idx, int start) {
		if (k-5==start) {
			int count=0;
			
			for (int i=0;i<n;i++) {
				boolean isValid = true;
				for (int j=0;j<arr[i].length();j++) {
					if(!visited[arr[i].charAt(j)-'a']) {
						isValid = false;
						break;
					}
				}
				if (isValid) count++;
			}
			if (max<count) max=count;
			return;
		}
		
		for (int i=idx;i<26;i++) {
			if (!visited[i]) {
				visited[i] = true;
				func(i,start+1);
				visited[i] = false;
			}
		}	
	}
}