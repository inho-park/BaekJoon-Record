package _baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	// �Է�
	//	ù° �ٿ� N�� M�� �־�����. (1 �� N �� 106, 2 �� M �� 103)
	//	��° �ٿ� N���� �� A1, A2, ..., AN�� �־�����. (0 �� Ai �� 109)
	// ���
	//	ù° �ٿ� ���ӵ� �κ� ������ ���� M���� ������ �������� ������ ������ ����Ѵ�.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()); 
	    long nums[] = new long [n + 1], result = 0, mods[] = new long [m];
	    st = new StringTokenizer(br.readLine(), " ");
	    for (int i = 1; i <= n; i++) {
	    	nums[i] = (nums[i - 1] + Integer.parseInt(st.nextToken())) % m;
	    	if (nums[i] == 0) result++;
	    	mods[(int)nums[i]]++;
	    }
	    for (int i = 0; i < m; i++) 
	    	if (mods[i] > 1) 
	    		result += (mods[i] * (mods[i] - 1) /2);
	    
	    System.out.print(result);
	}
}