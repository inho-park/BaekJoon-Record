package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class First_1697 {
	// �Է�
	//	ù° �ٿ� �� ���� N, M(2 �� N, M �� 100)�� �־�����. 
	//	���� N���� �ٿ��� M���� ������ �̷ΰ� �־�����. ������ ������ �پ �Է����� �־�����.
	// ���
	//	ù° �ٿ� ������ �ϴ� �ּ��� ĭ ���� ����Ѵ�. �׻� ������ġ�� �̵��� �� �ִ� ��츸 �Է����� �־�����.
	static int n, k, arr [];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int [100001];
        
        bfs(n);
        System.out.print(arr[k] - 1);
    }
    
    static void bfs(int idx) {
    	Queue<Integer> queue = new LinkedList<>();
    	queue.offer(idx);
    	arr[idx] = 1;
    	while(!queue.isEmpty()) {
    		Integer next = queue.poll();
    		
    		if (next == k) {
    			return;
    		}
    		
    		if (next - 1 >= 0 && arr[next - 1] == 0) {
    			arr[next - 1] = arr[next] + 1;
    			queue.offer(next - 1);
    		}
    		
    		if (next + 1 < 100001 && arr[next + 1] == 0) {
    			arr[next + 1] = arr[next] + 1;
    			queue.offer(next + 1);
    		}
    		
    		if (next * 2 < 100001 && arr[next * 2] == 0) {
    			arr[next * 2] = arr[next] + 1;
    			queue.offer(next * 2);
    		}
    	}
    }
}
