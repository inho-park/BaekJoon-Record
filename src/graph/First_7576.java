package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class First_7576 {
	// �Է�
	//	ù �ٿ��� ������ ũ�⸦ ��Ÿ���� �� ���� M,N�� �־�����. M�� ������ ���� ĭ�� ��, N�� ������ ���� ĭ�� ���� ��Ÿ����. 
	//	��, 2 �� M,N �� 1,000 �̴�. ��° �ٺ��ʹ� �ϳ��� ���ڿ� ����� �丶����� ������ �־�����. 
	//	��, ��° �ٺ��� N���� �ٿ��� ���ڿ� ��� �丶���� ������ �־�����. �ϳ��� �ٿ��� ���� �����ٿ� ����ִ� �丶���� ���°� M���� ������ �־�����. 
	//	���� 1�� ���� �丶��, ���� 0�� ���� ���� �丶��, ���� -1�� �丶�䰡 ������� ���� ĭ�� ��Ÿ����.
	//	�丶�䰡 �ϳ� �̻� �ִ� ��츸 �Է����� �־�����.
	// ���
	//	�������� �丶�䰡 ��� ���� �������� �ּ� ��¥�� ����ؾ� �Ѵ�. 
	//	����, ����� ������ ��� �丶�䰡 �;��ִ� �����̸� 0�� ����ؾ� �ϰ�, �丶�䰡 ��� ������ ���ϴ� ��Ȳ�̸� -1�� ����ؾ� �Ѵ�.
	static int m, n, arr [][], cnt = 0;
	static Queue<Queue<Integer []>> list = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        arr = new int [n][m];
        Queue<Integer []> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine());
        	for(int j = 0; j < m; j++) {
        		arr[i][j] = Integer.parseInt(st.nextToken());
        		if (arr[i][j] == 1) {
        			Integer [] push = {i, j};
        			queue.offer(push);
        		}
        	}
        }
        bfs(queue);
        for (int i = 0; i < n; i++)
        	for(int j = 0; j < m; j++)
        		if (arr[i][j] == 0) {
        			System.out.print(-1);
        			System.exit(0);
        		}
        System.out.print(cnt);
    }
    
    static void bfs(Queue<Integer []> queue) {
    	int delta [][] = {{1, -1, 0, 0}, {0, 0, 1, -1}};
    	Queue<Integer []> nextQueue = new LinkedList<>();
    	int size = queue.size();
    	for (int x = 0; x < size; x++) {
    		Integer [] now = queue.poll();
    		for (int i = 0; i < 4; i++) {
    			int nextRow = now[0] + delta[0][i];
    			int nextCol = now[1] + delta[1][i];
    			if (nextRow < 0 || nextRow > n - 1 || nextCol < 0 || nextCol > m - 1 ) continue;
    			if (arr[nextRow][nextCol] != 0) continue;
    			arr[nextRow][nextCol] = 1;
    			Integer [] push = {nextRow, nextCol};
    			nextQueue.offer(push);
    		}
    	}
    	if (nextQueue.size() != 0) {
    		cnt++;
    		bfs(nextQueue);
    	}
    }
}
