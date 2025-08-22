package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_24313 {
	// 입력
	//	첫째 줄에 함수 f(n)을 나타내는 정수 a1, a0가 주어진다. (0 ≤ |ai| ≤ 100)
	//	다음 줄에 양의 정수 c가 주어진다. (1 ≤ c ≤ 100)
	//	다음 줄에 양의 정수 n0가 주어진다. (1 ≤ n0 ≤ 100)
	// 출력
	//	f(n), c, n0가 O(n) 정의를 만족하면 1, 아니면 0을 출력한다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a1 = Integer.parseInt(st.nextToken());
		int a0 = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(br.readLine());
		int n0 = Integer.parseInt(br.readLine());
		boolean isO = true;
		for (int i = n0; i <= 100; i++) {
			if (a1 * i + a0 > c * i) {
				isO = false;
			}
		}
		System.out.print(isO ? 1 : 0);
	}
}