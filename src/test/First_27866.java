package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_27866 {
	// �Է�
	//	ù° �ٿ� ���� �ҹ��ڿ� �빮�ڷθ� �̷���� �ܾ� S�� �־�����. �ܾ��� ���̴� �ִ� 1,000$�̴�.
	//	��° �ٿ� ���� i�� �־�����. (1 <= i <= |S|)
	// ���
	//	S�� i��° ���ڸ� ����Ѵ�.
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char [] arr = br.readLine().toCharArray();
		System.out.print(arr[Integer.parseInt(br.readLine()) - 1]);
	}
}
