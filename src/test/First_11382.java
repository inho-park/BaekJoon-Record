package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_11382 {
	// �Է�
	//	ù ��° �ٿ� A, B, C (1 �� A, B, C �� 10^12)�� ������ ���̿� �ΰ� �־�����.
	// ���
	//	A+B+C�� ���� ����Ѵ�.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		System.out.print(Long.parseLong(st.nextToken()) + Long.parseLong(st.nextToken()) + Long.parseLong(st.nextToken()));
	}
}
