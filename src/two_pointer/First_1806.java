package two_pointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_1806 {
	// 입력
	//	첫째 줄에 N (10 ≤ N < 100,000)과 S (0 < S ≤ 100,000,000)가 주어진다. 
	//	둘째 줄에는 수열이 주어진다. 수열의 각 원소는 공백으로 구분되어져 있으며, 10,000이하의 자연수이다.
	// 출력
	//	첫째 줄에 구하고자 하는 최소의 길이를 출력한다. 만일 그러한 합을 만드는 것이 불가능하다면 0을 출력하면 된다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		int arr [] = new int [n + 1];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int i = 0, j = 0, sum = 0, cnt = n + 1;
		while(j <= n && i <= j) {
			if (sum >= s) {
				cnt = Math.min(cnt, j - i);
				sum -= arr[i++];
			}
			else {
				sum += arr[j++];
			}
		}
		System.out.print(cnt == n + 1 ? 0 : cnt);
	}
}
