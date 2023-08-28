package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Second_2346 {
	// 해결 방법
	//  LinkedList 로 하나의 노드에 포인터를 다는 구조는 노드 하나당 차지하는 메모리가 ArrayList 구조보다 크기 때문에 메모리 효율을 위해
	//  Array 를 사용해야한다 -> 사실 시간 제한을 2초나 줄 때 생각을 할 수 있었는데 아쉬운 부분
	
	// 입력
	//  첫째 줄에 자연수 N(1 ≤ N ≤ 1,000)이 주어진다. 다음 줄에는 차례로 각 풍선 안의 종이에 적혀 있는 수가 주어진다. 종이에 0은 적혀있지 않다.
	// 출력
	//	첫째 줄에 터진 풍선의 번호를 차례로 나열한다.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Deque<int []> d = new ArrayDeque<>();
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
