package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_3003 {
	// 입력
	//	첫째 줄에 동혁이가 찾은 흰색 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수가 주어진다. 이 값은 0보다 크거나 같고 10보다 작거나 같은 정수이다.
	// 출력
	//	첫째 줄에 입력에서 주어진 순서대로 몇 개의 피스를 더하거나 빼야 되는지를 출력한다. 
	//	만약 수가 양수라면 동혁이는 그 개수 만큼 피스를 더해야 하는 것이고, 음수라면 제거해야 하는 것이다.
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		System.out.print((1 - Integer.parseInt(st.nextToken())) + " " + (1 - Integer.parseInt(st.nextToken())) + " " + (2 - Integer.parseInt(st.nextToken())) + " " + (2 - Integer.parseInt(st.nextToken())) + " " + (2 - Integer.parseInt(st.nextToken())) + " " + (8 - Integer.parseInt(st.nextToken())));
	}
}
