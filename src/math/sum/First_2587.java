package math.sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class First_2587 {
	// 입력
	//	첫째 줄부터 다섯 번째 줄까지 한 줄에 하나씩 자연수가 주어진다. 주어지는 자연수는 100 보다 작은 10의 배수이다.
	// 출력
	//	첫째 줄에는 평균을 출력하고, 둘째 줄에는 중앙값을 출력한다. 평균과 중앙값은 모두 자연수이다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr [] = new int [5];
		int total = 0;
		for (int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			total += arr[i];
			
		}
		Arrays.sort(arr);
		System.out.println(total/5);
		System.out.print(arr[2]);
	}
}