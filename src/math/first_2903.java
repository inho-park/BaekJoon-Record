package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class first_2903 {
	// 입력
	//	첫째 줄에 N이 주어진다. (1 ≤ N ≤ 15)
		
	// 출력
	//	첫째 줄에 과정을 N번 거친 후 점의 수를 출력한다.
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = (Integer.parseInt(br.readLine())), temp = 2;
		for (int i = 1; i <= n; i++) temp += (temp - 1);
		System.out.print(temp * temp);
	}
	
}
