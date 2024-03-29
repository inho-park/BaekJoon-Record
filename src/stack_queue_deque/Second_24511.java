package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Second_24511 {
	// 해결 방법
	//  스택은 push 한 값을 그대로 pop 하므로 의미가 하나도 없으므로 전부 제외한다
	//  그리고, 각 큐에 원소가 하나밖에 존재하지 않고 각 큐의 원소 값이 그대로 다음 큐의 원소가 되는 구조이기 때문에
	//  각각의 큐들이 거대한 하나의 큐를 이룬다고 생각하면 된다.
	// 입력
	//  첫째 줄에 queuestack을 구성하는 자료구조의 개수 N이 주어진다. 
	//  둘째 줄에 길이 N의 수열 A가 주어진다. i번 자료구조가 큐라면 A_i = 0, 스택이라면 A_i = 1이다.
	//  셋째 줄에 길이 N의 수열 B가 주어진다. B_i는 i번 자료구조에 들어 있는 원소이다.
	//	넷째 줄에 삽입할 수열의 길이 M이 주어진다.
	//  다섯째 줄에 queuestack에 삽입할 원소를 담고 있는 길이 M의 수열 C가 주어진다. 
	// 출력
	//	수열 C의 원소를 차례대로 queuestack에 삽입했을 때의 리턴값을 공백으로 구분하여 출력한다.	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()), val;
		boolean [] boolArr = new boolean [n];
		Deque<Integer> queue = new ArrayDeque<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) boolArr[i] = Integer.parseInt(st.nextToken()) == 1?false:true;
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			if (boolArr[i]) queue.add(Integer.parseInt(st.nextToken()));
			else st.nextToken();
		}
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < m; i++) {
			val = Integer.parseInt(st.nextToken());
			queue.addFirst(val);
			sb.append(queue.pollLast() + " ");
		}
		System.out.print(sb);
	}
}