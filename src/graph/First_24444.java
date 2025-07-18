package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class First_24444 {
	// 입력
	//	첫째 줄에 정점의 수 N (5 ≤ N ≤ 100,000), 간선의 수 M (1 ≤ M ≤ 200,000), 시작 정점 R (1 ≤ R ≤ N)이 주어진다.
	//	다음 M개 줄에 간선 정보 u v가 주어지며 정점 u와 정점 v의 가중치 1인 양방향 간선을 나타낸다. 
	//	(1 ≤ u < v ≤ N, u ≠ v) 모든 간선의 (u, v) 쌍의 값은 서로 다르다.
	// 출력
	//	첫째 줄부터 N개의 줄에 정수를 한 개씩 출력한다. i번째 줄에는 정점 i의 방문 순서를 출력한다. 
	//	시작 정점의 방문 순서는 1이다. 시작 정점에서 방문할 수 없는 경우 0을 출력한다.
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	static int arr [], cnt;
    public static void main(String[] args) throws IOException {
    	StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new  StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        
        arr = new int [n + 1];
        
        for (int i = 0; i < n + 1; i++) {
        	graph.add(new ArrayList<>());
        }
        
        for (int i = 0; i < m; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int start = Integer.parseInt(st.nextToken());
        	int end = Integer.parseInt(st.nextToken());
        	
        	graph.get(start).add(end);
        	graph.get(end).add(start);
        }
        for (int i = 1; i < n + 1; i++) {        	
        	Collections.sort(graph.get(i));
        }
        bfs(r);
        for(int i = 1; i < arr.length; i++) {
        	sb.append(arr[i]).append("\n");
        }
        System.out.print(sb);
    }
    
    static void bfs(int start) {
    	Queue<Integer> queue = new LinkedList<>();
    	cnt = 1;
    	queue.offer(start);
    	arr[start] = cnt++;
    	while(!queue.isEmpty()) {
    		int next = queue.poll();    		
    		for (int i = 0; i < graph.get(next).size(); i++) {
    			int nextTo = graph.get(next).get(i);
    			if (arr[nextTo] == 0) {
    				queue.offer(nextTo);
    				arr[nextTo] = cnt++;
    			}
    		}
    	}
    }
}
