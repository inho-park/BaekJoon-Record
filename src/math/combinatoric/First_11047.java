package math.combinatoric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_11047 {
	// 입력
	//	첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)
	//	둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)
	// 출력
	//	첫째 줄에 K원을 만드는데 필요한 동전 개수의 최솟값을 출력한다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int [] arr = new int [n];
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			arr[i] = Integer.parseInt(s);
		}
		
		int cnt = 0;
		for (int i = n - 1; i >= 0; i--) {
			cnt += k / arr[i];
			k %= arr[i];
		}
		
		System.out.print(cnt);
	}
}
