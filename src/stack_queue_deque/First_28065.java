package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_28065 {
	// 입력
	//	첫째 줄에 구하고자 하는 SW 수열의 길이 N이 주어진다. (3 <= N <=> 5000) 
	// 출력
	//	첫째 줄에 길이가 N인 SW 수열을 아무거나 하나 출력한다. SW 수열은 공백으로 구분해서 출력해야 한다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
        int k = 1;
        boolean flag = true;
        while (k <= n) {
            if (flag) sb.append(n--).append(" ");
            else sb.append(k++).append(" ");
            flag = !flag;
        }

        System.out.print(sb);
	}
}