package combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_4134 {
	
// 입력
//	첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다.
// 출력
//	각각의 테스트 케이스에 대해서 n보다 크거나 같은 소수 중 가장 작은 소수를 한 줄에 하나씩 출력한다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			Long prime = Long.parseLong(br.readLine());
			while (true) {
				if (isPrime(prime)) {
					sb.append(prime + "\n");
					break;
				}
				prime++;
			}
		}
		System.out.print(sb);
		
	}
	
	static boolean isPrime(Long num) {
		if (num == 0 || num == 1) return false;
	    for (int i = 2; i <= Math.sqrt(num); i++) {
	    	if (num % i == 0) return false;
	    }
	    return true;
	}
}
