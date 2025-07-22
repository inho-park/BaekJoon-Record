package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class First_1260 {
	// 입력
	//	첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V가 주어진다. 
	//	다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다. 어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.
	// 출력
	//	첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. V부터 방문된 점을 순서대로 출력하면 된다.
	static int dfs_cnt, bfs_cnt, dfs_arr [], bfs_arr [];
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        dfs_arr = new int [n + 1];
        bfs_arr = new int [n + 1];
        // dfs
        for (int i = 0; i < n + 1; i++) {
        	graph.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	graph.get(a).add(b);
        	graph.get(b).add(a);
        }
        for (int i = 1; i < n + 1; i++) {
        	Collections.sort(graph.get(i));
        }
        dfs_cnt = 1;
        dfs(v);
        for (int i = 1; i < n + 1; i++) {
        	sb.append(dfs_arr[i]).append(" ");
        }
        sb.append("\n");
        
        //bfs
        bfs(v);
        for(int i = 1; i < n + 1; i++) {
        	sb.append(bfs_arr[i]).append(" ");
        }
        System.out.print(sb);
    }
    
    static void dfs(int start) {
    	dfs_arr[start] = dfs_cnt;
    	for (int i = 1; i < graph.get(start).size(); i++) {
    		int next = graph.get(start).get(i);
    		if (dfs_arr[next] == 0) {
    			dfs_cnt++;
    			dfs(next);
    		}
    	}
    }
    
    static void bfs(int start) {
    	Queue<Integer> queue = new LinkedList<>();
    	bfs_cnt = 1;
    	queue.offer(start);
    	bfs_arr[start] = bfs_cnt++;
    	while(!queue.isEmpty()) {
    		int next = queue.poll();    		
    		for (int i = 0; i < graph.get(next).size(); i++) {
    			int nextTo = graph.get(next).get(i);
    			if (bfs_arr[nextTo] == 0) {
    				queue.offer(nextTo);
    				bfs_arr[nextTo] = bfs_cnt++;
    			}
    		}
    	}
    }
}
