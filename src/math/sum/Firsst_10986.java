package math.sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Firsst_10986 {
	// �Է�
		//	ù° �ٿ� N�� M�� �־�����. (1 �� N �� 106, 2 �� M �� 103)
		//	��° �ٿ� N���� �� A1, A2, ..., AN�� �־�����. (0 �� Ai �� 109)
		// ���
		//	ù° �ٿ� ���ӵ� �κ� ������ ���� M���� ������ �������� ������ ������ ����Ѵ�.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()),result = 0;
	    boolean dp[][] = new boolean [n+1][n+1];
	    int nums[] = new int [n + 1];
	    st = new StringTokenizer(br.readLine(), " ");
	    for (int i = 1; i <= n; i++) nums[i] = nums[i - 1] + Integer.parseInt(st.nextToken());
	    for (int i = 1; i <= n; i++) {
	    	for (int j = 0; j < i; j++) {
	    		if ((nums[i] - nums[j])%m == 0) dp[i][j + 1] = true;
	    	}
	    }
	    for (boolean []arr: dp)
	    	for (boolean mod: arr)
	    		if (mod) result++;
	    
	    System.out.print(result);
	}
}