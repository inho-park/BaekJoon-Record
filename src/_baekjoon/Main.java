package _baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

// 입력
// 첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36)
// B진법 수 N을 10진법으로 바꾸면, 항상 10억보다 작거나 같다.
	
// 출력
// 첫째 줄에 B진법 수 N을 10진법으로 출력한다.

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		char[] n = st.nextToken().toCharArray();
		int b = Integer.parseInt(st.nextToken()), result = 0, cnt = 0, round = 1;
		for (int i = n.length - 1; i >= 0; i--) {
			for (int j = 0; j < cnt; j++) round *= b;
			if (48<=(int)n[i]&&(int)n[i]<=57) {
				// - 48
				result += ((int)n[i] - 48) * round;
			} else {
				// - 54
				result += ((int)n[i] - 55) * round;
			}
			cnt++;
			round = 1;
		}
		System.out.println(result);
		br.close();
	}

}
