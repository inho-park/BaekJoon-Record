package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class First_28279 {
	// 입력
	//  첫째 줄에 명령의 수 N이 주어진다. (1 ≤ N ≤ 1,000,000)
	//  둘째 줄부터 N개 줄에 명령이 하나씩 주어진다.
	//  출력을 요구하는 명령은 하나 이상 주어진다.
	// 출력
	//	출력을 요구하는 명령이 주어질 때마다 명령의 결과를 한 줄에 하나씩 출력한다.
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> d = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			switch(Integer.parseInt(st.nextToken())) {
				case 1:
					d.addFirst(Integer.parseInt(st.nextToken()));
					break;
				case 2:
					d.addLast(Integer.parseInt(st.nextToken()));
					break;
				case 3:
					if (d.isEmpty()) sb.append(-1 + "\n");
					else sb.append(d.pollFirst() + "\n");
					break;
				case 4:
					if (d.isEmpty()) sb.append(-1 + "\n");
					else sb.append(d.pollLast() + "\n");
					break;
				case 5:
					sb.append(d.size() + "\n");
					break;
				case 6:
					sb.append(d.isEmpty()?1 + "\n":0 + "\n");
					break;
				case 7:
					if (d.isEmpty()) sb.append(-1 + "\n");
					else sb.append(d.peekFirst() + "\n");
					break;
				default:
					if (d.isEmpty()) sb.append(-1 + "\n");
					else sb.append(d.peekLast() + "\n");
					break;
			}
		}
		System.out.print(sb);
	}
}
