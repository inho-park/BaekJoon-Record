package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_10101 {
	// �Է�
	//	�� 3���� �ٿ� ���� �ﰢ���� ���� ũ�Ⱑ �־�����. ��� ������ 0���� ũ��, 180���� �۴�.
	// ���
	//	������ ���� ���� Equilateral, Isosceles, Scalene, Error �� �ϳ��� ����Ѵ�.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		if (a + b + c == 180) {
			if (a == b) {
				if (b == c) System.out.print("Equilateral");
				else System.out.print("Isosceles");
			} else {
				if (b == c) System.out.print("Isosceles");
				else { 
					if (a == c) System.out.print("Isosceles");
					else System.out.print("Scalene");
				
				}
			}
		} else System.out.print("Error");
	}
}