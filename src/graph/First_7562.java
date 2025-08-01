package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class First_7562 {
	// �Է�
	//	�Է��� ù° �ٿ��� �׽�Ʈ ���̽��� ������ �־�����.
	//	�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ִ�. ù° �ٿ��� ü������ �� ���� ���� l(4 �� l �� 300)�� �־�����. 
	//	ü������ ũ��� l �� l�̴�. ü������ �� ĭ�� �� ���� �� {0, ..., l-1} �� {0, ..., l-1}�� ��Ÿ�� �� �ִ�. 
	//	��° �ٰ� ��° �ٿ��� ����Ʈ�� ���� �ִ� ĭ, ����Ʈ�� �̵��Ϸ��� �ϴ� ĭ�� �־�����.
	// ���
	//	�� �׽�Ʈ ���̽����� ����Ʈ�� �ּ� �� ������ �̵��� �� �ִ��� ����Ѵ�.
	static int l, n, arr [][], finishRow, finishCol;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        l = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < l; i++) {
        	n = Integer.parseInt(br.readLine());
        	arr = new int [n][n];
        	st = new StringTokenizer(br.readLine());
        	int row = Integer.parseInt(st.nextToken());
        	int col = Integer.parseInt(st.nextToken());
        	st = new StringTokenizer(br.readLine());
        	finishRow = Integer.parseInt(st.nextToken());
        	finishCol = Integer.parseInt(st.nextToken());        	
        	bfs(row, col);
        	sb.append(arr[finishRow][finishCol] - 1).append("\n");
        }
        System.out.print(sb);
    }
    
    static void bfs(int row, int col) {
    	Queue<Integer []> queue = new LinkedList<>();
    	Integer [] temp = {row, col};
    	queue.offer(temp);
    	arr[row][col] = 1;
    	int delta [][] = {{1, 2, 2, 1, -1, -2, -2, -1}, {-2, -1, 1, 2, 2, 1, -1, -2}};
    	while(!queue.isEmpty()) {
    		Integer [] now = queue.poll();
    		
    		for (int i = 0; i < 8; i++) {
    			int nextRow = now[0] + delta[0][i];
    			int nextCol = now[1] + delta[1][i];
    			if (nextRow < 0 || nextRow > n - 1 || nextCol < 0 || nextCol > n - 1 ) continue;
    			if (arr[nextRow][nextCol] != 0) continue;
    			
    			arr[nextRow][nextCol] = arr[now[0]][now[1]] + 1;
    			Integer [] push = {nextRow, nextCol};
    			queue.offer(push);
    			if (nextRow == finishRow && nextCol == finishCol) return;
    		}
    	}
    }
}
