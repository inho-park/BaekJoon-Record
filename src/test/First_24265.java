package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_24265 {
	// �Է�
	//	ù° �ٿ� �Է��� ũ�� n(1 �� n �� 500,000)�� �־�����.
	// ���
	//	ù° �ٿ� �ڵ�1 �� ���� Ƚ���� ����Ѵ�.
	//	��° �ٿ� �ڵ�1�� ���� Ƚ���� ���׽����� ��Ÿ������ ��, �ְ������� ������ ����Ѵ�. 
	//	��, ���׽����� ��Ÿ�� �� ���ų� �ְ������� ������ 3���� ũ�� 4�� ����Ѵ�.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Integer.parseInt(br.readLine());
		System.out.println(n * (n - 1) / 2);
		System.out.print(2);
	}
}