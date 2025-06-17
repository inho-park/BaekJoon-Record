package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_13305 {
	// �Է�
	//	ǥ�� �Է����� ���� ������ �־�����. ù ��° �ٿ��� ������ ������ ��Ÿ���� ���� N(2 �� N �� 100,000)�� �־�����. 
	//	���� �ٿ��� ������ �� ���ø� �����ϴ� ������ ���̰� ���� ���� ���κ��� N-1���� �ڿ����� �־�����. 
	//	���� �ٿ��� �������� ���ʹ� ������ ���� ���� ���ú��� ������� N���� �ڿ����� �־�����. 
	//	���� ���� ���ú��� ���� ������ ���ñ����� �Ÿ��� 1�̻� 1,000,000,000 ������ �ڿ����̴�. ���ʹ� ������ 1 �̻� 1,000,000,000 ������ �ڿ����̴�. 
	// ���
	//	ǥ�� ������� ���� ���� ���ÿ��� ���� ������ ���÷� ���� �ּ� ����� ����Ѵ�. 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()) - 1;
		
		int length [] = new int [n];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			length[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int min = Integer.MAX_VALUE, gas;
		long result = 0l;
		for (int i = 0; i < n; i++) {
			gas = Integer.parseInt(st.nextToken());
			if (min > gas) min = gas;
			result+= min*length[i];
		}
		System.out.print(result);
	}
}