package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class First_2566 {
	// 입력
	//	첫째 줄부터 아홉 번째 줄까지 한 줄에 아홉 개씩 수가 주어진다. 주어지는 수는 100보다 작은 자연수 또는 0이다.
	// 출력
	//	첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 위치한 행 번호와 열 번호를 빈칸을 사이에 두고 차례로 출력한다. 
	//	최댓값이 두 개 이상인 경우 그 중 한 곳의 위치를 출력한다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Comparator<Integer []> comparator = new Comparator<Integer []>() {
            @Override
            public int compare(Integer [] o1, Integer [] o2) {
                return o2[0] - o1[0];
            }
        };
        Queue<Integer []> queue = new PriorityQueue<>(comparator);
		for (int i = 1; i <= 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 1; j <= 9; j++) {
				Integer [] push = {Integer.parseInt(st.nextToken()), i, j};
				queue.offer(push);
			}
		}
		Integer [] result = queue.poll();
		System.out.println(result[0]);
		System.out.print(result[1] + " " + result[2]);
	}
}