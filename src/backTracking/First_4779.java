package backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_4779 {
	// 입력
	//  입력을 여러 줄로 이루어져 있다. 각 줄에 N이 주어진다. 파일의 끝에서 입력을 멈춘다. N은 0보다 크거나 같고, 12보다 작거나 같은 정수이다.
	// 출력
	//	입력으로 주어진 N에 대해서, 해당하는 칸토어 집합의 근사를 출력한다.
	static boolean arr[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		int cnt;
		while((str = br.readLine()) != null) {
			cnt = (int)Math.pow(3, Integer.parseInt(str));
			arr = new boolean [cnt];
			solve(0, cnt);
			for (int i = 0; i < cnt; i++) sb.append(arr[i]?" ":"-");
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	public static void solve(int first, int len) { 
		if (len < 3) return;
		
		for (int i = first + len/3; i < first + len/3*2; i++) arr[i] = true;
		solve(first, len/3);
		solve(first + len/3 * 2, len/3);
	}
}
