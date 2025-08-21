package binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class First_2110 {
	// 입력
	//	첫째 줄에 집의 개수 N (2 ≤ N ≤ 200,000)과 공유기의 개수 C (2 ≤ C ≤ N)이 하나 이상의 빈 칸을 사이에 두고 주어진다.
	//	둘째 줄부터 N개의 줄에는 집의 좌표를 나타내는 xi (0 ≤ xi ≤ 1,000,000,000)가 한 줄에 하나씩 주어진다.
	// 출력
	//	첫째 줄에 가장 인접한 두 공유기 사이의 최대 거리를 출력한다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(list);

		int start = 1;
		int end = list.get(list.size() - 1) - list.get(0);
		int result = 0;
		
		while (start <= end) {
			int mid = (start + end) / 2;
			int cnt = 1;
			int prev_house = list.get(0);
			
			for (int i = 1; i < n; i++) {
				if (list.get(i) - prev_house >= mid) {
					cnt++;
					prev_house = list.get(i);
				}
			}

			if (cnt >= c) {
				result = Math.max(result, mid);
				start = mid + 1;
			} else end = mid - 1;
		}
		System.out.print(result);
	}
}