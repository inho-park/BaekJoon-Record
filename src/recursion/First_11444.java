package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_11444 {
	// �Է�
	//	ù° �ٿ� n�� �־�����. n�� 1,000,000,000,000,000,000���� �۰ų� ���� �ڿ����̴�.
	// ���
	//	ù° �ٿ� n��° �Ǻ���ġ ���� 1,000,000,007���� ���� �������� ����Ѵ�.
	// ���� ��
	//	���� ���� ������ �� �� ���� �� ���� ���� �����鿡 ����Լ� Ȱ���� �׸��� ���δٸ� ��ķ� ��ȭ�ϴ� ���⵵ ����ϱ�
	static long n;
	final static long ARR [][] = {{1, 1}, {1, 0}}, MOD = 1000000007;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Long.parseLong(br.readLine());
		long fn [][] = {{1, 1}, {1, 0}};
		System.out.println(pow(fn, n - 1)[0][0]);
	}
	
	static long[][] pow(long [][] fn, long k) {
		if (k == 0 || k == 1) return fn;
		
		long ret [][] = pow(fn, k/2);
		
		ret = multifly(ret, ret);
		
		if (k % 2 == 1) {
			ret = multifly(ret, ARR);
		}
		
		return ret;
	}
	
	static long[][] multifly(long [][] ret1, long [][] ret2) {
		long [][] ret = new long [ret1.length][ret2[0].length];
		
		for (int i = 0; i < ret.length; i++) {
			for (int j = 0; j < ret[0].length; j++) {
				for (int k = 0; k < ret2.length; k++) {
					ret[i][j] += (ret1[i][k] * ret2[k][j]);
					ret[i][j] %= MOD;
				}
			}
		}
		return ret;
	}
}