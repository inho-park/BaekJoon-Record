package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class First_4949 {
	// 입력
	//  각 문자열은 마지막 글자를 제외하고 영문 알파벳, 공백, 소괄호("( )"), 대괄호("[ ]")로 이루어져 있으며, 온점(".")으로 끝나고, 길이는 100글자보다 작거나 같다.
	//	입력의 종료조건으로 맨 마지막에 온점 하나(".")가 들어온다.
	// 출력
	//	각 줄마다 해당 문자열이 균형을 이루고 있으면 "yes"를, 아니면 "no"를 출력한다.
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		while(true) {
			str = br.readLine();
			if (str.equals(".")) break;
			sb.append(stacker(str) + "\n");			
		}
		
		System.out.print(sb);
	}
	
	static String stacker(String str) {
		Stack<Character> s = new Stack<>();
		char arr [] = str.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '(' || arr[i] == '[') s.push(arr[i]);
			else if (arr[i] == ')') {
				if (s.empty() || s.peek() != '(') return "no"; 
				s.pop();
			}
			else if (arr[i] == ']') {
				if(s.empty() || s.peek() != '[') return "no"; 
				s.pop();
			}		
		}
		if (s.empty()) return "yes";
		else return "no";
	}
}
