package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_9086 {
	// �Է�
	//	�Է��� ù �ٿ��� �׽�Ʈ ���̽��� ���� T(1 �� T �� 10)�� �־�����. 
	//	�� �׽�Ʈ ���̽��� �� �ٿ� �ϳ��� ���ڿ��� �־�����. 
	//	���ڿ��� ���ĺ� A~Z �빮�ڷ� �̷������ ���ĺ� ���̿� ������ ������ ���ڿ��� ���̴� 1000���� �۴�.
	// ���
	//	�� �׽�Ʈ ���̽��� ���ؼ� �־��� ���ڿ��� ù ���ڿ� ������ ���ڸ� �����Ͽ� ����Ѵ�.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			char [] arr = br.readLine().toCharArray();
			System.out.println(arr[0] + "" + arr[arr.length - 1]);
		}
	}
}
