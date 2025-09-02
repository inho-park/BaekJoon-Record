package binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Second_1300 {
	// 입력
	//	첫째 줄에 배열의 크기 N이 주어진다. N은 105보다 작거나 같은 자연수이다. 
	//	둘째 줄에 k가 주어진다. k는 min(109, N2)보다 작거나 같은 자연수이다.
	// 출력
	//	B[k]를 출력한다.
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		
		long low = 1;
		long high = k;
		
		while(low < high) {
			
			long mid = (low + high) / 2;
			long cnt = 0;
			for(int i = 1; i <= n; i++) {
				cnt += Math.min(mid / i, n);
			}
			if(k <= cnt) {
				high = mid;
			}
			else {
				low = mid + 1;
			}
		}
		
		System.out.println(low);
	}
}