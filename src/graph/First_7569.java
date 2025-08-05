package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class First_7569 {
	// �Է�
	//	ù �ٿ��� ������ ũ�⸦ ��Ÿ���� �� ���� M,N�� �׾ƿ÷����� ������ ���� ��Ÿ���� H�� �־�����. 
	//	M�� ������ ���� ĭ�� ��, N�� ������ ���� ĭ�� ���� ��Ÿ����. ��, 2 �� M �� 100, 2 �� N �� 100, 1 �� H �� 100 �̴�. 
	//	��° �ٺ��ʹ� ���� ���� ���ں��� ���� ���� ���ڱ����� ����� �丶����� ������ �־�����. ��, 
	//	��° �ٺ��� N���� �ٿ��� �ϳ��� ���ڿ� ��� �丶���� ������ �־�����. �� �ٿ��� ���� �����ٿ� ����ִ� �丶����� ���°� M���� ������ �־�����. 
	//	���� 1�� ���� �丶��, ���� 0 �� ���� ���� �丶��, ���� -1�� �丶�䰡 ������� ���� ĭ�� ��Ÿ����. �̷��� N���� ���� H�� �ݺ��Ͽ� �־�����.
	//	�丶�䰡 �ϳ� �̻� �ִ� ��츸 �Է����� �־�����.
	// ���
	//	�������� �丶�䰡 ��� ���� ������ �ּ� ��ĥ�� �ɸ������� ����ؼ� ����ؾ� �Ѵ�. 
	//	����, ����� ������ ��� �丶�䰡 �;��ִ� �����̸� 0�� ����ؾ� �ϰ�, �丶�䰡 ��� ������ ���ϴ� ��Ȳ�̸� -1�� ����ؾ� �Ѵ�.
	static int m, n, h, arr [][][], cnt = 0;
	static Queue<Queue<Integer []>> list = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        arr = new int [h][n][m];
        Queue<Integer []> queue = new LinkedList<>();
        for (int i = 0; i < h; i++) {
        	for(int j = 0; j < n; j++) {
        		st = new StringTokenizer(br.readLine());
        		for (int k = 0; k < m; k++) {        			
        			arr[i][j][k] = Integer.parseInt(st.nextToken());
        			if (arr[i][j][k] == 1) {
        				Integer [] push = {i, j, k};
        				queue.offer(push);
        			}
        		}
        	}
        }
        bfs(queue);
        for (int i = 0; i < h; i++)
        	for(int j = 0; j < n; j++)
        		for (int k = 0; k < m; k++)         			
        			if (arr[i][j][k] == 0) {
        				System.out.print(-1);
        				System.exit(0);
        			}
        		
        System.out.print(cnt);
    }
    
    static void bfs(Queue<Integer []> queue) {
    	int delta [][] = {{1, -1, 0, 0, 0, 0}, {0, 0, 1, -1, 0, 0}, {0, 0, 0, 0, 1, -1}};
    	Queue<Integer []> nextQueue = new LinkedList<>();
    	int size = queue.size();
    	for (int x = 0; x < size; x++) {
    		Integer [] now = queue.poll();
    		for (int i = 0; i < 6; i++) {
    			int nextHeight = now[0] + delta[0][i];
    			int nextRow = now[1] + delta[1][i];
    			int nextCol = now[2] + delta[2][i];
    			if (nextHeight < 0 || nextHeight > h - 1 
    					|| nextRow < 0 || nextRow > n - 1
    					|| nextCol < 0 || nextCol > m - 1 ) continue;
    			if (arr[nextHeight][nextRow][nextCol] != 0) continue;
    			arr[nextHeight][nextRow][nextCol] = 1;
    			Integer [] push = {nextHeight, nextRow, nextCol};
    			nextQueue.offer(push);
    		}
    	}
    	if (nextQueue.size() != 0) {
    		cnt++;
    		bfs(nextQueue);
    	}
    }
}
