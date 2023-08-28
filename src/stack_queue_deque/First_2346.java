package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class First_2346 {
	// 틀린 이유
	//  메모리 초과 ( 4MB )
	// 입력
	//  첫째 줄에 자연수 N(1 ≤ N ≤ 1,000)이 주어진다. 다음 줄에는 차례로 각 풍선 안의 종이에 적혀 있는 수가 주어진다. 종이에 0은 적혀있지 않다.
	// 출력
	//	첫째 줄에 터진 풍선의 번호를 차례로 나열한다.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Deque<int []> d = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			int [] arr = {i+1, Integer.parseInt(st.nextToken())};
			d.add(arr);
		}
		int [] k = d.pollFirst();
		sb.append(k[0] + " ");
		while(d.size() != 1) {
			if (k[1] > 0) {
				for (int i = 0; i < k[1] - 1; i++) {
					d.addLast(d.pollFirst());
				}
			} else {
				for (int i = 0; i < k[1]*-1; i++) {
					d.addFirst(d.pollLast());
				}
			}
			k = d.poll();
			sb.append(k[0] + " ");
		}
		sb.append(d.poll()[0]);
		System.out.print(sb);
	}
}