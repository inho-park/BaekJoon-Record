package combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_2004 {
	// ���װ���� �ش�Ǵ� �� ���丮����� 10^0�ڸ������� 0�� ����
	// n!={2^a1, 5^b1}, (n-m)!={2^a2, 5^b2}, m!!={2^a3, 5^b3} ��� �������� ��
	// n!/(n-m)!m!{2^k, 5^k}
	// = 2^a1*5^b1/((2^a2*5^b2)(2^a3*5^b3))
	// = 2^a1*5^b1/2^(a2+a3)*5^(b2+b3)
	// = 2^(a1-a2-a3)*5^(b1-b2-b3)
	// �̹Ƿ� ���⿡�� 2�� �¼��� 5�� �¼� �� �� ���� ���� ���ؾ��Ѵ�
	// �� (a1-a2-a3) > (b1-b2-b3) ===> (b1-b2-b3)
	// (a1-a2-a3) < (b1-b2-b3) ===> (a1-a2-a3) �� ��������� �����ؾ��Ѵ�
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		long n = Long.parseLong(st.nextToken()), m = Long.parseLong(st.nextToken()), cnt= 0, N=n, M=m;
		while(N>=10) {
			cnt+=N/10;
			N/=10;
		}
		while(M>=10) {
			cnt-=M/10;
			M/=10;
		}
		long c = n-m;
		while(c>=10) {
			cnt-=c/10;
			c/=10;
		}
		System.out.print(cnt);
	}
}