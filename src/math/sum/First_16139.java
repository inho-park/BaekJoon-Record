package math.sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_16139 {
	// �Է�
	// ù �ٿ� ���ڿ� S�� �־�����. 
	//	���ڿ��� ���̴� 200,000�� �����̸� ���ĺ� �ҹ��ڷθ� �����Ǿ���. 
	//	�� ��° �ٿ��� ������ �� q�� �־�����, ������ ���� 1 <= q <= 200,000�� �����Ѵ�. 
	//	�� ��° �ٺ��� (q+2)��° �ٿ��� ������ �־�����. �� ������ ���ĺ� �ҹ��� a_i�� 0 <= l_i <= r_i < |S|�� �����ϴ� ���� l_i,r_i�� �������� ���еǾ� �־�����.
	// ���
	//	�� �������� ���� ������ ������� �亯�Ѵ�. 
	//	i��° �ٿ� S�� l_i��° ���ں��� r_i��° ���� ���̿� a_i�� ��Ÿ���� Ƚ���� ����Ѵ�.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		char alphabet, strArr[] = br.readLine().toCharArray();
		int n = Integer.parseInt(br.readLine()), start, end, cnt, arr[][] = new int [26][strArr.length];
		for (int i = 0; i < 26; i++) {
			char I = (char)(i + 97);
			cnt = 0;
			for (int j = 0; j < strArr.length; j++) {
				if (strArr[j] == I) cnt++;
				arr[i][j] = cnt;
			}
		}
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			alphabet = st.nextToken().charAt(0);
			start = Integer.parseInt(st.nextToken());
			end = Integer.parseInt(st.nextToken());
			
			int result = start == 0 ? arr[(int)alphabet - 97][end] : arr[(int)alphabet - 97][end] - arr[(int)alphabet - 97][start - 1];
			sb.append(result).append("\n");
		}
		System.out.print(sb);
	}
}
