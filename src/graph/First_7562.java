package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class First_7562 {
	// 입력
	//	입력의 첫째 줄에는 테스트 케이스의 개수가 주어진다.
	//	각 테스트 케이스는 세 줄로 이루어져 있다. 첫째 줄에는 체스판의 한 변의 길이 l(4 ≤ l ≤ 300)이 주어진다. 
	//	체스판의 크기는 l × l이다. 체스판의 각 칸은 두 수의 쌍 {0, ..., l-1} × {0, ..., l-1}로 나타낼 수 있다. 
	//	둘째 줄과 셋째 줄에는 나이트가 현재 있는 칸, 나이트가 이동하려고 하는 칸이 주어진다.
	// 출력
	//	각 테스트 케이스마다 나이트가 최소 몇 번만에 이동할 수 있는지 출력한다.
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
