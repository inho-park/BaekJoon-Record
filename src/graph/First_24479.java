package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class First_24479 {
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
        cnt = 1;
        dfs(r);
        for(int i = 1; i < arr.length; i++) {
        	sb.append(arr[i]).append("\n");
        }
        System.out.print(sb);
    }
    
    static void dfs(int start) {
    	arr[start] = cnt;
    	for (int i = 0; i < graph.get(start).size(); i++) {
    		int next = graph.get(start).get(i);
    		if (arr[next] == 0) {    			
    			cnt++;
    			dfs(next);
    		}
    	}
    }
}
