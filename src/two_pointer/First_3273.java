package two_pointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class First_3273 {
	// 입력
	//	첫째 줄에 수열의 크기 n이 주어진다. 다음 줄에는 수열에 포함되는 수가 주어진다. 셋째 줄에는 x가 주어진다. 
	//	(1 ≤ n ≤ 100000, 1 ≤ x ≤ 2000000)
	// 출력
	//	문제의 조건을 만족하는 쌍의 개수를 출력한다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int sum = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if (sum > temp) list.add(temp);
        }
		list.sort(null);
		
		int result = 0;
		int i = 0, j = list.size() - 1;
		while(i < j) {
			int x = list.get(i) + list.get(j);
			
			if(sum == x) result++;
			
			if(sum > x) {
				i++;
			}else {
				j--;
			}
		}
		System.out.print(result);
	}
}
