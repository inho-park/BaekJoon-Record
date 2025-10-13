package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_10813 {
	// 입력
	//	첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
	//	둘째 줄부터 M개의 줄에 걸쳐서 공을 교환할 방법이 주어진다. 
	//	각 방법은 두 정수 i j로 이루어져 있으며, i번 바구니와 j번 바구니에 들어있는 공을 교환한다는 뜻이다. (1 ≤ i ≤ j ≤ N) 
	//	도현이는 입력으로 주어진 순서대로 공을 교환한다.
	// 출력
	//	1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int [] arr = new int [n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = i;
		}
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int swap = arr[a];
			arr[a] = arr[b];
			arr[b] = swap;
		}
		String str = "";
		for (int i = 1; i < n; i++) {
			str += arr[i] + " ";
		}
		str += arr[n];
		System.out.print(str);
	}
}
