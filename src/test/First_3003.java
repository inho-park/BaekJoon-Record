package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_3003 {
	// �Է�
	//	ù° �ٿ� �����̰� ã�� ��� ŷ, ��, ��, ���, ����Ʈ, ���� ������ �־�����. �� ���� 0���� ũ�ų� ���� 10���� �۰ų� ���� �����̴�.
	// ���
	//	ù° �ٿ� �Է¿��� �־��� ������� �� ���� �ǽ��� ���ϰų� ���� �Ǵ����� ����Ѵ�. 
	//	���� ���� ������ �����̴� �� ���� ��ŭ �ǽ��� ���ؾ� �ϴ� ���̰�, ������� �����ؾ� �ϴ� ���̴�.
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		System.out.print((1 - Integer.parseInt(st.nextToken())) + " " + (1 - Integer.parseInt(st.nextToken())) + " " + (2 - Integer.parseInt(st.nextToken())) + " " + (2 - Integer.parseInt(st.nextToken())) + " " + (2 - Integer.parseInt(st.nextToken())) + " " + (8 - Integer.parseInt(st.nextToken())));
	}
}
