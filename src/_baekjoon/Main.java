package _baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

// �Է�
//	ù° �ٿ� N�� �־�����. (1 �� N �� 15)
	
// ���
//	ù° �ٿ� ������ N�� ��ģ �� ���� ���� ����Ѵ�.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = (Integer.parseInt(br.readLine())), temp = 2;
		for (int i = 1; i <= n; i++) temp += (temp - 1);
		System.out.print(temp * temp);
	}
}