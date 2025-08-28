package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class First_2566 {
	// �Է�
	//	ù° �ٺ��� ��ȩ ��° �ٱ��� �� �ٿ� ��ȩ ���� ���� �־�����. �־����� ���� 100���� ���� �ڿ��� �Ǵ� 0�̴�.
	// ���
	//	ù° �ٿ� �ִ��� ����ϰ�, ��° �ٿ� �ִ��� ��ġ�� �� ��ȣ�� �� ��ȣ�� ��ĭ�� ���̿� �ΰ� ���ʷ� ����Ѵ�. 
	//	�ִ��� �� �� �̻��� ��� �� �� �� ���� ��ġ�� ����Ѵ�.
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