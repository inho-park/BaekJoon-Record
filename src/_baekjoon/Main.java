package _baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	// 입력
	//	첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000,000)이 주어진다.
	//	둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ Ai ≤ 1,000,000)
	// 출력
	//	첫째 줄에 수열 A의 가장 긴 증가하는 부분 수열의 길이를 출력한다.
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr [] = new int [n], lis [] = new int [n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		lis[0] = arr[0];
		int result = 1;
		for (int i = 1; i < n; i++) {
			int k = arr[i];
			if (lis[result - 1] < k) {
				result++;
				lis[result - 1] = k;
			} else {
				int low = 0, high = result;
				while(low < high) {
					int mid = (low + high) / 2;
					if (lis[mid] < k) low = mid + 1;
					else high = mid;
				}
				lis[low] = k;
			}
		}
		System.out.print(result);
	}
}
