package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_20944 {
	// �Է�
	//	������ ���� �Է��� �־�����. N
	// ���
	//	���̰� N�̰� ���ĺ� �ҹ��ڷ� �̷����, ���̻���̸鼭 �Ӹ������ ���ڿ��� ����Ѵ�. 
	//	�׻� �׷��� ���ڿ��� �����ϰ�, ���� ���� ������ �ִٸ� ���� �ϳ��� ����Ѵ�.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n/2; i++) {
			sb.append("a");
		}
		if (n%2 == 1) sb.append("b");
		for (int i = 0; i < n/2; i++) {
			sb.append("a");
		}
		System.out.print(sb);
	}
}