package binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_1654 {
	// 입력
	//	첫째 줄에는 오영식이 이미 가지고 있는 랜선의 개수 K, 그리고 필요한 랜선의 개수 N이 입력된다. 
	//	K는 1이상 10,000이하의 정수이고, N은 1이상 1,000,000이하의 정수이다. 그리고 항상 K <= N 이다. 
	//	그 후 K줄에 걸쳐 이미 가지고 있는 각 랜선의 길이가 센티미터 단위의 정수로 입력된다. 랜선의 길이는 2^(31-1)보다 작거나 같은 자연수이다.
	// 출력
	//	첫째 줄에 N개를 만들 수 있는 랜선의 최대 길이를 센티미터 단위의 정수로 출력한다.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int arr [] = new int [n];
		
		long max = 0;
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		max++; 
		long min = 0; 
		long mid = 0; 
 
		while (min < max) { 
			mid = (max + min) / 2;
			long count = 0;
			
			for (int i = 0; i < n; i++) {
				count += (arr[i] / mid);
			}
			if(count < m) {
				max = mid;
			}
			else {
				min = mid + 1;
			}
		}
		
		System.out.print(min - 1);
	}
}