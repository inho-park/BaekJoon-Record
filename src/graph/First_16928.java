package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class First_16928 {
	// �Է�
	//	ù° �ٿ� �����ǿ� �ִ� ��ٸ��� �� N(1 �� N �� 15)�� ���� �� M(1 �� M �� 15)�� �־�����.
	//	��° �ٺ��� N���� �ٿ��� ��ٸ��� ������ �ǹ��ϴ� x, y (x < y)�� �־�����. x�� ĭ�� �����ϸ�, y�� ĭ���� �̵��Ѵٴ� �ǹ��̴�.
	//	���� M���� �ٿ��� ���� ������ �ǹ��ϴ� u, v (u > v)�� �־�����. u�� ĭ�� �����ϸ�, v�� ĭ���� �̵��Ѵٴ� �ǹ��̴�.
	//	1�� ĭ�� 100�� ĭ�� ��� ��ٸ��� ���� �Ǵ� ���� �ƴϴ�. ��� ĭ�� �ִ� �ϳ��� ��ٸ� �Ǵ� ���� ������ ������, 
	//	���ÿ� �� ������ ��� ������ �ִ� ���� ����. �׻� 100�� ĭ�� ������ �� �ִ� �Է¸� �־�����.
	// ���
	//	100�� ĭ�� �����ϱ� ���� �ֻ����� �ּ� �� �� ������ �ϴ��� ����Ѵ�.
	static int arr [] = new int [101];
	static Map<Integer, Integer> portal = new HashMap<>();
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	portal.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        
        bfs();
    }
    
    static void bfs() {
    	int cnt = 0;
    	int loc = 1;
    	arr[loc] = cnt;
    	Queue<Integer> queue = new LinkedList<>();
    	queue.offer(loc);
    	while(!queue.isEmpty()) {
    		loc = queue.poll();
    		for (int i = 1; i <= 6; i++) {
    			int next = loc + i;
    			if (next == 100) {
    				System.out.print(arr[loc] + 1);
    				return;
    			}
    			next = portal.containsKey(next) ? portal.get(next) : next;
    			if (arr[next] == 0) {
    				arr[next] = arr[loc] + 1;
    				queue.offer(next);
    			} else continue;
    		}
    	}
    }
}
