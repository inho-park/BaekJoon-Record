package stack_queue_deque;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class First_1202 {
	// �Է�
	//	ù° �ٿ� N�� K�� �־�����. (1 �� N, K �� 300,000)
	//	���� N�� �ٿ��� �� ������ ���� Mi�� Vi�� �־�����. (0 �� Mi, Vi �� 1,000,000)
	//	���� K�� �ٿ��� ���濡 ���� �� �ִ� �ִ� ���� Ci�� �־�����. (1 �� Ci �� 100,000,000)
	//	��� ���ڴ� ���� �����̴�.
	// ���
	//	ù° �ٿ� ����̰� ��ĥ �� �ִ� ���� ������ ���� �ִ��� ����Ѵ�.
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
 
        Jewel[] jewelries = new Jewel[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
 
            jewelries[i] = new Jewel(m, v);
        }
        Arrays.sort(jewelries, new Comparator<Jewel>() {
 
            @Override
            public int compare(Jewel o1, Jewel o2) {
                if (o1.mass == o2.mass) {
                    return o2.value - o1.value;
                }
                return o1.mass - o2.mass;
            }
 
        });
 
        int[] bags = new int[k];
        for (int i = 0; i < k; i++) {
            bags[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(bags);
 
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long ans = 0;
        for (int i = 0, j = 0; i < k; i++) {
            while (j < n && jewelries[j].mass <= bags[i]) {
                pq.offer(jewelries[j++].value);
            }
            if (!pq.isEmpty()) {
                ans += pq.poll();
            }
        }
        System.out.print(ans);
        br.close();
    }
 
	static class Jewel {
		int mass;
		int value;
		
		Jewel(int mass, int value) {
			this.mass = mass;
			this.value = value;
		}
	}

}
