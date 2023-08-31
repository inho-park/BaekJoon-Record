package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_24060 {
	// 입력
	//  첫째 줄에 배열 A의 크기 N(5 ≤ N ≤ 500,000), 저장 횟수 K(1 ≤ K ≤ 10^8)가 주어진다.
	//  다음 줄에 서로 다른 배열 A의 원소 A1, A2, ..., AN이 주어진다. (1 ≤ Ai ≤ 109)
	// 출력
	//	배열 A에 K 번째 저장 되는 수를 출력한다. 저장 횟수가 K 보다 작으면 -1을 출력한다.
	
	static int[] a, tmp;
	static int cnt = 0;
	static int result = -1;
	static int k;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken()); k = Integer.parseInt(st.nextToken());
		a = new int [n]; tmp = new int [n];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());
		merge_sort(a, 0, n - 1);
		System.out.print(result);
	}
	
	public static void merge_sort(int[] a, int p, int r) {
		if (p < r) {
			int q = (p + r)/2;
			merge_sort(a, p, q);
			merge_sort(a, q + 1, r);
			merge(a, p, q, r);
		}
	}
	
	public static void merge(int[] a, int p, int q, int r) {
		int i = p, j = q + 1, t = 0;
		while(i <= q && j <= r) {
			if (a[i] <= a[j]) tmp[t++] = a[i++];
			else tmp[t++] = a[j++];
		}
		while (i <= q) tmp[t++] = a[i++];
		while (j <= r) tmp[t++] = a[j++];
		i = p; t = 0;
		while (i <= r) {
			cnt++;
			if (cnt == k) {
				result = tmp[t];
				break;
			}
			a[i++] = tmp[t++];
		}
	}
}
