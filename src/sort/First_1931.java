package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// Activity selection problem 알고리즘 참고

public class First_1931 {
	// 입력
	//	첫째 줄에 회의의 수 N(1 ≤ N ≤ 100,000)이 주어진다. 
	//	둘째 줄부터 N+1 줄까지 각 회의의 정보가 주어지는데 이것은 공백을 사이에 두고 회의의 시작시간과 끝나는 시간이 주어진다. 
	//	시작 시간과 끝나는 시간은 2^31-1보다 작거나 같은 자연수 또는 0이다.
	// 출력
	//	첫째 줄에 최대 사용할 수 있는 회의의 최대 개수를 출력한다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int [][] arr = new int [n][2];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[1]==o2[1] ? o1[0]-o2[0] : o1[1]-o2[1];
			}
		});
		
		int finish = 0, cnt = 0;
		
		// 정렬 순위
		// 1. 종료시간을 기준으로 오름차순 정렬
		// 2. 시작시간을 기준으로 오름차순 정렬
		for (int i = 0; i < arr.length; i++) {
			if (finish <= arr[i][0]) {
				finish = arr[i][1];
				cnt++;
			}
		}
		
		System.out.print(cnt);
	}
}