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
	// �Է�
	//	ù° �ٿ� ������ ���� N(1 �� N �� 1,000), ������ ���� M(1 �� M �� 10,000), Ž���� ������ ������ ��ȣ V�� �־�����. 
	//	���� M���� �ٿ��� ������ �����ϴ� �� ������ ��ȣ�� �־�����. � �� ���� ���̿� ���� ���� ������ ���� �� �ִ�. �Է����� �־����� ������ ������̴�.
	// ���
	//	ù° �ٿ� DFS�� ������ �����, �� ���� �ٿ��� BFS�� ������ ����� ����Ѵ�. V���� �湮�� ���� ������� ����ϸ� �ȴ�.
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
