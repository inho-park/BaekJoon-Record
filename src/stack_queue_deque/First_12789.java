package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class First_12789 {
	// �Է�
	//  �Է��� ù° �ٿ��� ���� ��ȯ���� �տ� �� �ִ� �л����� �� N(1 �� N �� 1,000,�ڿ���)�� �־�����.
	//	���� �ٿ��� ��ȯ�� �տ� ���ִ� ��� �л����� ��ȣǥ(1,2,...,N) ������ �տ������� �� ������ �־�����.
	// ���
	//	��ȯ�̰� ������ ������ ���� �� ������ "Nice"(����ǥ�� ����)�� ����ϰ� �׷��� �ʴٸ� "Sad"(����ǥ�� ����)�� ����Ѵ�.
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<>();	
		Stack<Integer> s = new Stack<>();	
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i < n; i++) {
			q.offer(Integer.parseInt(st.nextToken()));
		}
		
		int start = 1;
		
		while(!q.isEmpty()) {
			if(q.peek() == start) {
				q.poll();
				start++;
			}else if(!s.isEmpty() && s.peek() == start) {
				s.pop();
				start++;
			}else {	
				s.push(q.poll());
			}
		}
		while(!s.isEmpty()) {
			if(s.peek() == start) {
				s.pop();
				start++;
			}else {
				System.out.println("Sad");
				return;
			}
		}
		System.out.println("Nice");
	}
}