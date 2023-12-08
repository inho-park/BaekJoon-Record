package math.sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_25682 {
	// �Է�
	//	ù° �ٿ� ���� N, M, K�� �־�����. 
	//	��° �ٺ��� N���� �ٿ��� ������ �� ���� ���°� �־�����. B�� �������̸�, W�� ����̴�.
	// ���
	//	ù° �ٿ� �����̰� �߶� K��K ���带 ü�������� ����� ���� �ٽ� ĥ�ؾ� �ϴ� ���簢�� ������ �ּڰ��� ����Ѵ�.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
	    int board[][] = new int [n + 1][m + 1];
	    boolean color = true;
	    for (int i = 1; i <= n; i++) { 
	    	char line[] = br.readLine().toCharArray();
	    	for (int j = 1; j <= m; j++) {
	    		if (color && line[j - 1] == 'W') board[i][j] += 1;
	    		else if (!color && line[j - 1] =='B') board[i][j] += 1;
	    		color = !color;
	    	}
	    	if(m % 2 == 0) color = !color;
	    }
	    
	    for (int i = 1; i <= n; i++) {
	    	int temp = board[i][1];
	    	for (int j = 2; j <= m; j++) {
	    		temp += board[i][j];
	    		board[i][j] = temp;
	    	}
	    }
	    
	    for (int i = 1; i <= m; i++) {
	    	int temp = board[1][i];
	    	for (int j = 2; j <= n; j++) {
	    		temp += board[j][i];
	    		board[j][i] = temp;
	    	}
	    }
	    
	    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
	    for (int i = k; i <= n; i++)
	    	for (int j = k; j <= m; j++) {
	    		int temp = board[i][j] - board[i][j - k] - board[i - k][j] + board[i - k][j - k];
	    		min = Math.min(min, temp);
	    		max = Math.max(max, temp);
	    	}
	    
	    System.out.print(Math.min(min, k * k - max));
	}
}