package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class First_28278 {
	// 입력
	//	첫째 줄에 명령의 수 N이 주어진다. (1 ≤ N ≤ 1,000,000)
	//	둘째 줄부터 N개 줄에 명령이 하나씩 주어진다.
	//	출력을 요구하는 명령은 하나 이상 주어진다.
	// 출력
	//	출력을 요구하는 명령이 주어질 때마다 명령의 결과를 한 줄에 하나씩 출력한다.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> stack = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			switch(Integer.parseInt(st.nextToken())) {
				case 1:
					int value = Integer.parseInt(st.nextToken());
					stack.add(value);
					break;
				case 2:
					if (stack.isEmpty()) {
						sb.append(-1 + "\n");
						break;
					}else {
						int tos = stack.size()-1;
						sb.append(stack.get(tos) + "\n");
						stack.remove(tos);
					}
					break;
				case 3:
					sb.append(stack.size() + "\n");
					break;
				case 4:
					if (stack.isEmpty()) sb.append(1 + "\n");
					else sb.append(0 + "\n");
					break;
				case 5:
					if (stack.isEmpty()) sb.append(-1 + "\n");
					else sb.append(stack.get(stack.size()-1) + "\n");
					break;
			}
		}
		System.out.print(sb);
	}
}
