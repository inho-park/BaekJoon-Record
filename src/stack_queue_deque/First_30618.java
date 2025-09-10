package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class First_30618 {
	// 입력
	//	첫째 줄에 구하고자 하는 순열의 길이 N이 주어진다. (1 <= N <= 200,000) 
	// 출력
	//	첫째 줄에 점수가 가장 높은 순열에 해당하는 N개의 정수를 공백으로 구분해서 출력한다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		Deque<Integer> deque = new LinkedList<>();
		boolean check = false;
		
		for (int i = n; i >= 1; i--) {
			if (!check) {
				deque.addLast(i);
			} else {
				deque.addFirst(i);
			}
			
			check = !check;
		}
		while (!deque.isEmpty()) {
			sb.append(deque.poll()).append(" ");
		}
		System.out.print(sb);
		br.close();
	}
}