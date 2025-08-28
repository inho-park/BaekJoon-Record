package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_2720 {
	// �Է�
	//	ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. 
	//	�� �׽�Ʈ ���̽��� �Ž����� C�� ��Ÿ���� ���� �ϳ��� �̷���� �ִ�. C�� ������ ��Ʈ�̴�. (1�޷� = 100��Ʈ) (1<=C<=500)
	// ���
	//	�� �׽�Ʈ���̽��� ���� �ʿ��� ������ ����, ������ ����, ������ ����, ����� ������ �������� �����Ͽ� ����Ѵ�.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int quarter = n / 25;
			int dime = (n - quarter * 25) / 10;
			int nickel = (n - quarter * 25 - dime * 10) / 5;
			int penny = n - quarter * 25 - dime * 10 - nickel * 5;
			System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
		}
	}
}