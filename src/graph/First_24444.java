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
	// �Է�
	//	ù° �ٿ� ������ �� N (5 �� N �� 100,000), ������ �� M (1 �� M �� 200,000), ���� ���� R (1 �� R �� N)�� �־�����.
	//	���� M�� �ٿ� ���� ���� u v�� �־����� ���� u�� ���� v�� ����ġ 1�� ����� ������ ��Ÿ����. 
	//	(1 �� u < v �� N, u �� v) ��� ������ (u, v) ���� ���� ���� �ٸ���.
	// ���
	//	ù° �ٺ��� N���� �ٿ� ������ �� ���� ����Ѵ�. i��° �ٿ��� ���� i�� �湮 ������ ����Ѵ�. 
	//	���� ������ �湮 ������ 1�̴�. ���� �������� �湮�� �� ���� ��� 0�� ����Ѵ�.
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
