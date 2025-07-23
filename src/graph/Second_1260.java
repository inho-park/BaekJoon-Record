package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Second_1260 {
	// 입력
	//	첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V가 주어진다. 
	//	다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다. 어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.
	// 출력
	//	첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. V부터 방문된 점을 순서대로 출력하면 된다.
	static int n, cnt;
	static boolean check [], arr [][];
	static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        
        arr = new boolean [n + 1][n + 1];
        check = new boolean [n + 1];
        for (int i = 0; i < m; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	arr[a][b] = arr[b][a] = true;
        }

        // dfs
        cnt = 1;
        dfs(v);
        sb.append("\n");
        
        check = new boolean [n + 1];
        
        //bfs
        bfs(v);
        System.out.print(sb);
    }
    
    static void dfs(int start) {
    	check[start] = true;
    	sb.append(start).append(" ");
    	if (cnt == n) {
    		return;
    	}
    	cnt++;
    	for (int i = 1; i < n + 1; i++) {
    		if (!check[i] && arr[start][i]) {
    			dfs(i);
    		}
    	}
    }
    
    static void bfs(int start) {
    	Queue<Integer> queue = new LinkedList<>();
    	queue.offer(start);
    	check[start] = true;
    	sb.append(start).append(" ");
    	while(!queue.isEmpty()) {
    		int from = queue.poll();    		
    		for (int i = 1; i < n + 1; i++) {
    			if (arr[from][i] && !check[i]) {
    				queue.offer(i);
    				check[i] = true;
    				sb.append(i).append(" ");
    			}
    		}
    	}
    }
}
