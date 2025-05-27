package binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_2805 {
	// 입력
	//	첫째 줄에 나무의 수 N과 상근이가 집으로 가져가려고 하는 나무의 길이 M이 주어진다. (1 ≤ N ≤ 1,000,000, 1 ≤ M ≤ 2,000,000,000)
	//	둘째 줄에는 나무의 높이가 주어진다. 나무의 높이의 합은 항상 M보다 크거나 같기 때문에, 상근이는 집에 필요한 나무를 항상 가져갈 수 있다. 
	//	높이는 1,000,000,000보다 작거나 같은 양의 정수 또는 0이다.
	// 출력
	//	적어도 M미터의 나무를 집에 가져가기 위해서 절단기에 설정할 수 있는 높이의 최댓값을 출력한다.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int arr [] = new int [n];
		long max = 0;
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		max++; 
		long min = 0; 
		long mid = 0; 
 
		while (min < max) { 
			mid = (max + min) / 2;
			long count = 0;
			
			for (int i = 0; i < n; i++) {
				if (arr[i] > mid) count += (arr[i] - mid);
			}
			if(count < m) {
				max = mid;
			}
			else {
				min = mid + 1;
			}
		}
		
		System.out.print(min - 1);
	}
}