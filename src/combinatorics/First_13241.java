package combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_13241 {
	// �Է�
	//	�� �ٿ� �� ���� A�� B�� �������� �и��Ǿ� �־�����.
	// ���
	//	A�� B�� �ּҰ������ �� �ٿ� ����Ѵ�.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long a = Long.parseLong(st.nextToken()),b = Long.parseLong(st.nextToken()), temp;
		long A = a, B = b;
		while(true) {
			if (a % b == 0) {
				System.out.print(A*B/b);
				break;
			}
			else {
				temp = a;
				a = b;
				b = temp % b;
			}
		}
	}
}
