package math.sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_1541 {
	// �Է�
	//	ù° �ٿ� ���� �־�����. ���� ��0��~��9��, ��+��, �׸��� ��-�������� �̷���� �ְ�, ���� ó���� ������ ���ڴ� �����̴�. 
	//	�׸��� �����ؼ� �� �� �̻��� �����ڰ� ��Ÿ���� �ʰ�, 5�ڸ����� ���� ���ӵǴ� ���ڴ� ����. ���� 0���� ������ �� �ִ�. 
	//	�Է����� �־����� ���� ���̴� 50���� �۰ų� ����.
	// ���
	//	ù° �ٿ� ��ȣ�� ������ �ļ� ���� �ּҷ� ������� ��, ������ ����Ѵ�.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer sub = new StringTokenizer(br.readLine(), "-");
		int result = 4999950;
		while(sub.hasMoreTokens()) {
			int temp = 0;
			StringTokenizer add = new StringTokenizer(sub.nextToken(), "+");
			while(add.hasMoreTokens()) {
				temp += Integer.parseInt(add.nextToken());
			}
			if (result == 4999950) {
				result = temp;
			} else {
				result -= temp;
			}
		}
		
		System.out.print(result);
	}
}