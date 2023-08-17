package combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_13241 {
	// 입력
	//	한 줄에 두 정수 A와 B가 공백으로 분리되어 주어진다.
	// 출력
	//	A와 B의 최소공배수를 한 줄에 출력한다.
	
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
