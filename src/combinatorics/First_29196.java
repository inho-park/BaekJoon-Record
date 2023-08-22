package combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_29196 {
	// �κ� ����
	// ���ǿ� �°� �� �� ������ ���� �𸣴� �κ��� �ִ� �� ����
	
	// �Է�
	//	ù ��° �ٿ� �Ҽ� k�� �־�����.
	// ���
	//	ù ��° �ٿ� ������ �����ϴ� �м��� �����Ѵٸ� YES, �ƴ϶�� NO�� ����Ѵ�.
	//	���� �׷��� �м��� �����Ѵٸ�, �� ��° �ٿ� �� ���� p, q�� ������ ���̿� �ΰ� ����Ѵ�.
	//	������ ���� �� �����Ѵٸ� ���� �ƹ��ų� ����ص� �������.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
//		double k = Double.parseDouble(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), ".");
		st.nextToken();
		
		int a = Integer.parseInt(st.nextToken()), b;
		if (a <= 10) b = 10;
		else if (a <= 100) b = 100;
		else if (a <= 1000) b = 1000;
		else if (a <= 10000) b = 10000;
		else if (a <= 100000) b = 100000;
		else if (a <= 1000000) b = 1000000;
		else if (a <= 10000000) b = 10000000;
		else b = 100000000;
		
		System.out.println("YES");
		System.out.print(a + " " + b);
	}
}
