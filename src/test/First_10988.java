package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_10988 {
	// �Է�
	//	ù° �ٿ� �ܾ �־�����. �ܾ��� ���̴� 1���� ũ�ų� ����, 100���� �۰ų� ������, ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.
	// ���
	//	ù° �ٿ� �Ӹ�����̸� 1, �ƴϸ� 0�� ����Ѵ�.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char [] arr = br.readLine().toCharArray();
		for (int i = 0; i < arr.length/2; i++) {
			if (arr[i] != arr[arr.length - 1 - i]) {
				System.out.print(0);
				System.exit(0);
			}
		}
		System.out.print(1);
	}
}