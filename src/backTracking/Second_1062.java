package backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Second_1062 {
	// ���� § �ڵ��� ������ ũ�� 2��������
	// 1
	// idx �� start �� ���� �з��Ͽ� ���ĺ��� Ž���� �� i �� idx �� �ʱ�ȭ�ϸ� �ð��� �� �����ų �� �ְ� start �� ������Ű�鼭
	// �ݺ������� return �Ͽ� ����� �����ε� �̸� �������� ����
	// 2
	// ��¥ ���̾��� �Ǽ�
	// k == 26 �̸� n �� ����ؾ��ϴµ� �� 26�̶� ����� ���ݵ� �𸣰���
	static int k, n, max=0;
	static String arr[];
	static boolean visited [] = new boolean [26];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken()); 
		arr = new String [n];
		String str;
		if (k<5) System.out.print(0);
		else if (k==26) System.out.print(n);
		else {
			for (int i=0;i<n;i++) {
				str = br.readLine();
				arr[i] = str.substring(4,str.length()-4);
			}
			visited ['a'-'a'] = true;
			visited ['n'-'a'] = true;
			visited ['t'-'a'] = true;
			visited ['i'-'a'] = true;
			visited ['c'-'a'] = true;
			func(0,0);
			System.out.println(max);
		}
	}
	
	static void func(int idx, int start) {
		if (k-5==start) {
			int count=0;
			
			for (int i=0;i<n;i++) {
				boolean isValid = true;
				for (int j=0;j<arr[i].length();j++) {
					if(!visited[arr[i].charAt(j)-'a']) {
						isValid = false;
						break;
					}
				}
				if (isValid) count++;
			}
			if (max<count) max=count;
			return;
		}
		
		for (int i=idx;i<26;i++) {
			if (!visited[i]) {
				visited[i] = true;
				func(i,start+1);
				visited[i] = false;
			}
		}	
	}
}