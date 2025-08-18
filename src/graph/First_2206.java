package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class First_2206 {
	// �Է�
	//	ù° �ٿ� N(1 �� N �� 1,000), M(1 �� M �� 1,000)�� �־�����. 
	//	���� N���� �ٿ� M���� ���ڷ� ���� �־�����. (1, 1)�� (N, M)�� �׻� 0�̶�� ��������.
	// ���
	//	ù° �ٿ� �ִ� �Ÿ��� ����Ѵ�. �Ұ����� ���� -1�� ����Ѵ�.
	static int arr [][], n, m, result [][][]; 
	static Queue<Integer []> queue = new LinkedList<>();
	static int delta [][] = {{1, -1, 0, 0}, {0, 0, 1, -1}}; 
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int [n][m];
        result = new int [n][m][2];
        for (int i = 0; i < n; i++) {
        	char chArr [] = br.readLine().toCharArray();
        	for (int j = 0; j < m; j++) {
        		arr[i][j] = chArr[j] - '0';
        	}
        }
        if (n == 1 && m == 1) {
			System.out.println(1);
			System.exit(0);
		}
        bfs();
    }
    
    static void bfs() {
    	Integer loc [] = {0, 0};
    	result[0][0][0] = 1;
    	queue.offer(loc);
    	while(!queue.isEmpty()) {
    		loc = queue.poll();
    		int row = loc[0];
    		int col = loc[1];
    		for (int i = 0; i < 4; i++) {
    			int nextRow = row + delta[0][i];
    			int nextCol = col + delta[1][i];
    			
    			if (nextRow == n - 1 && nextCol == m -1) {
    				System.out.print(result[row][col][0] + 1);
    				return;
    			}
    			if (nextRow >= n || nextRow < 0 || nextCol >= m || nextCol < 0) continue;
    			result[nextRow][nextCol][1] = result[row][col][1];
    			if (result[nextRow][nextCol][0] == 0) {
    				if (arr[nextRow][nextCol] == 0) {
    					result[nextRow][nextCol][0] = result[row][col][0] + 1;
    					Integer push [] = {nextRow, nextCol};
    					queue.offer(push);
    				} else {
    					if (result[row][col][1] != 0) continue;
    					else {
    						result[nextRow][nextCol][1] = 1;
    						result[nextRow][nextCol][0] = result[row][col][0] + 1;
        					Integer push [] = {nextRow, nextCol};
        					queue.offer(push);
    					}
    				}
    			}
    		}
    	}
    	System.out.print(-1);
    }
}