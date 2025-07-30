package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class First_2178 {
	// 입력
	//	첫째 줄에 두 정수 N, M(2 ≤ N, M ≤ 100)이 주어진다. 
	//	다음 N개의 줄에는 M개의 정수로 미로가 주어진다. 각각의 수들은 붙어서 입력으로 주어진다.
	// 출력
	//	첫째 줄에 지나야 하는 최소의 칸 수를 출력한다. 항상 도착위치로 이동할 수 있는 경우만 입력으로 주어진다.
	static int n, m, arr [][];
	static boolean check [][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int [n + 2][m + 2];
        check = new boolean [n + 2][m + 2];
        
        for (int i = 1; i < n + 1; i++) {
        	char [] charArr = br.readLine().toCharArray();
        	for (int j = 1; j < m + 1; j++) {
        		arr[i][j] = charArr[j - 1] - '0';
        	}
        }
        
        bfs(1, 1);
        System.out.print(arr[n][m]);
    }
    
    static void bfs(int row, int col) {
    	Queue<Integer []> queue = new LinkedList<>();
    	Integer [] temp = {row, col};
    	queue.offer(temp);
    	check[row][col] = true;
    	int delta [][] = {{1, -1, 0, 0},{0, 0, 1, -1}};
    	while(!queue.isEmpty()) {
    		Integer [] next = queue.poll();    		
    		for (int i = 0; i < 4; i++) {
    			int nextY = next[0] + delta[0][i];
    			int nextX = next[1] + delta[1][i];
    			
    			if (nextY > n || nextX > m || nextY < 1 || nextX < 1) continue;
    			if (arr[nextY][nextX] == 0) continue;
    			if (check[nextY][nextX]) continue;
    			Integer [] push = {nextY, nextX};
    			queue.offer(push);
    			check[nextY][nextX] = true;
    			arr[nextY][nextX] = arr[next[0]][next[1]] + 1;
    		}
    	}
    }
}
