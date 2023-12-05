package math.sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_16139 {
	// 입력
	// 첫 줄에 문자열 S가 주어진다. 
	//	문자열의 길이는 200,000자 이하이며 알파벳 소문자로만 구성되었다. 
	//	두 번째 줄에는 질문의 수 q가 주어지며, 문제의 수는 1 <= q <= 200,000을 만족한다. 
	//	세 번째 줄부터 (q+2)번째 줄에는 질문이 주어진다. 각 질문은 알파벳 소문자 a_i와 0 <= l_i <= r_i < |S|를 만족하는 정수 l_i,r_i가 공백으로 구분되어 주어진다.
	// 출력
	//	각 질문마다 줄을 구분해 순서대로 답변한다. 
	//	i번째 줄에 S의 l_i번째 문자부터 r_i번째 문자 사이에 a_i가 나타나는 횟수를 출력한다.
	
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
