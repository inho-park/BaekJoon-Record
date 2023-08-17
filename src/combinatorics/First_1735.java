package combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_1735 {

	// �Է�
	//	ù° �ٿ� N�� �־�����. (1 �� N �� 15)
		
	// ���
	//	ù° �ٿ� ������ N�� ��ģ �� ���� ���� ����Ѵ�.

	// Ʋ�� ����
	/* ��� �м��� ������ �߸� �ľ��ϰ� �־���
	 �켱 ���� ���ؾ��ϴ� �� �м��� �и���� ������ �ִ������� ã������ �õ��� �߸��ƴ�
	 �翬�� �� ���� ���� �м��� ���ڿ� �и��� �ִ������� ã�ƾ��ϴµ� ��ó���� ���� �Ǽ��� �ʹ� ���� �ð��� ��Ҵ� 
	 */
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int num1 = Integer.parseInt(st.nextToken()), den1 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		int num2 = Integer.parseInt(st.nextToken()), den2 = Integer.parseInt(st.nextToken()); 
				
		int num = num1 * den2 + num2 * den1, den = den1 * den2, gcd = gcd(num, den);
		
		System.out.print(num / gcd + " " + den /gcd);
		br.close();
	}
	
	static int gcd(int num, int den) { 
		if (num % den == 0) return den;
		return gcd(den, num % den);
	}
}
