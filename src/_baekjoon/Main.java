package _baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {	
	// 입력
	//  입력의 첫째 줄에는 현재 승환이의 앞에 서 있는 학생들의 수 N(1 ≤ N ≤ 1,000,자연수)이 주어진다.
	//	다음 줄에는 승환이 앞에 서있는 모든 학생들의 번호표(1,2,...,N) 순서가 앞에서부터 뒤 순서로 주어진다.
	// 출력
	//	승환이가 무사히 간식을 받을 수 있으면 "Nice"(따옴표는 제외)를 출력하고 그렇지 않다면 "Sad"(따옴표는 제외)를 출력한다.
	
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
				break;
			}
		}
		System.out.println("Nice");
	}
}
