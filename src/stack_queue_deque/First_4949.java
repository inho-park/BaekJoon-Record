package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class First_4949 {
	// �Է�
	//  �� ���ڿ��� ������ ���ڸ� �����ϰ� ���� ���ĺ�, ����, �Ұ�ȣ("( )"), ���ȣ("[ ]")�� �̷���� ������, ����(".")���� ������, ���̴� 100���ں��� �۰ų� ����.
	//	�Է��� ������������ �� �������� ���� �ϳ�(".")�� ���´�.
	// ���
	//	�� �ٸ��� �ش� ���ڿ��� ������ �̷�� ������ "yes"��, �ƴϸ� "no"�� ����Ѵ�.
	
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
