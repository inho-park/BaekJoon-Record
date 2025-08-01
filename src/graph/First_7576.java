package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class First_7576 {
	// 입력
	//	첫 줄에는 상자의 크기를 나타내는 두 정수 M,N이 주어진다. M은 상자의 가로 칸의 수, N은 상자의 세로 칸의 수를 나타낸다. 
	//	단, 2 ≤ M,N ≤ 1,000 이다. 둘째 줄부터는 하나의 상자에 저장된 토마토들의 정보가 주어진다. 
	//	즉, 둘째 줄부터 N개의 줄에는 상자에 담긴 토마토의 정보가 주어진다. 하나의 줄에는 상자 가로줄에 들어있는 토마토의 상태가 M개의 정수로 주어진다. 
	//	정수 1은 익은 토마토, 정수 0은 익지 않은 토마토, 정수 -1은 토마토가 들어있지 않은 칸을 나타낸다.
	//	토마토가 하나 이상 있는 경우만 입력으로 주어진다.
	// 출력
	//	여러분은 토마토가 모두 익을 때까지의 최소 날짜를 출력해야 한다. 
	//	만약, 저장될 때부터 모든 토마토가 익어있는 상태이면 0을 출력해야 하고, 토마토가 모두 익지는 못하는 상황이면 -1을 출력해야 한다.
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
