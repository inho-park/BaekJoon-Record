package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class First_14215 {
	// 입력
	//	첫째 줄에 a, b, c (1 ≤ a, b, c ≤ 100)가 주어진다.
	// 출력
	//	첫째 줄에 만들 수 있는 가장 큰 삼각형의 둘레를 출력한다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int arr [] = new int [3];
		arr[0] = Integer.parseInt(st.nextToken());
		arr[1] = Integer.parseInt(st.nextToken());
		arr[2] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		System.out.print(arr[2] < arr[0] + arr[1] ? arr[0] + arr[1] + arr[2] : (arr[0] + arr[1]) * 2 - 1);
	}
}