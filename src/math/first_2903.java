package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class first_2903 {
	// �Է�
	//	ù° �ٰ� ��° �ٿ�, �� �м��� ���ڿ� �и� ���ϴ� �� ���� �ڿ����� ������� �־�����. �ԷµǴ� �� �ڿ����� ��� 30,000 �����̴�.
		
	// ���
	//	ù° �ٿ� ���ϰ��� �ϴ� ���м��� ���ڿ� �и� ���ϴ� �� ���� �ڿ����� �� ĭ�� ���̿� �ΰ� ������� ����Ѵ�.
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = (Integer.parseInt(br.readLine())), temp = 2;
		for (int i = 1; i <= n; i++) temp += (temp - 1);
		System.out.print(temp * temp);
	}
	
}
