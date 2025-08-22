package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_19532 {
	// 입력
	//	정수 a, b, c, d, e, f가 공백으로 구분되어 차례대로 주어진다. (-999 <= a,b,c,d,e,f <= 999)
	//	문제에서 언급한 방정식을 만족하는 (x,y)가 유일하게 존재하고, 이 때 x와 y가 각각 -999 이상 999 이하의 정수인 경우만 입력으로 주어짐이 보장된다.
	// 출력
	//	문제의 답인 x와 y를 공백으로 구분해 출력한다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int arr [] = new int [6];
		for (int i = 0; i < 6; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int x = -1000, y = -1000;
		for (int i = -999; i < 1000; i++) {
			for (int j = -999; j < 1000; j++) {				
				if (arr[0] * i + arr[1] * j == arr[2] && arr[3] * i + arr[4] * j == arr[5]) {
					x = i;
					y = j;
					break;
				}
			}
		}
		System.out.print(x + " " + y);
	}
}