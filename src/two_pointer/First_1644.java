package two_pointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class First_1644 {
	// 입력
	//	첫째 줄에 자연수 N이 주어진다. (1 ≤ N ≤ 4,000,000)
	// 출력
	//	첫째 줄에 자연수 N을 연속된 소수의 합으로 나타낼 수 있는 경우의 수를 출력한다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
        	if (isPrime[i]) {
        		list.add(i);
        	}
        }
        list.sort(null);
        list.add(0);
        
		int i = 0, j = 0, sum = 0, cnt = 0;
		while(j < list.size() && i <= j) {
			if (sum < n) {
				sum += list.get(j++);
			} else {
				if (sum == n) {
					cnt++;
				}
				sum -= list.get(i++);
			}
		}
		System.out.print(cnt);
	}
}
