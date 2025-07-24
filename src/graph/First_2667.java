package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class First_2667 {
	// 입력
	//	첫 번째 줄에는 지도의 크기 N(정사각형이므로 가로와 세로의 크기는 같으며 5≤N≤25)이 입력되고, 그 다음 N줄에는 각각 N개의 자료(0혹은 1)가 입력된다.
	// 출력
	//	첫 번째 줄에는 총 단지수를 출력하시오. 그리고 각 단지내 집의 수를 오름차순으로 정렬하여 한 줄에 하나씩 출력하시오.
	static int n, cnt = 0;
	static boolean check [][], arr [][];
	static StringBuilder sb = new StringBuilder();
	static PriorityQueue<Integer> list = new PriorityQueue<Integer>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new boolean [n + 2][n + 2];
        check = new boolean [n + 2][n + 2];
        
        for (int i = 1; i < n + 1; i++) {
        	char [] charArr = br.readLine().toCharArray();
        	for (int j = 0; j < charArr.length; j++) {
        		arr[i][j + 1] = charArr[j] == '1' ? true : false;
        	}
        }
        
        for (int i = 1; i < n + 1; i++) {
        	for (int j = 1; j < n + 1; j++) {
        		dfs(i, j);
        		if (cnt != 0) {
        			list.add(cnt);
        			cnt = 0;
        		}
        	}
        }
        
        sb.append(list.size()).append("\n");
        while(!list.isEmpty()) {
        	sb.append(list.poll()).append("\n");
        }
        System.out.print(sb);
    }
    
    static void dfs(int row, int col) {
    	if (col > n || col < 1) return;
    	if (row > n || row < 1) return;
    	if (check[row][col]) return;
    	
    	if (arr[row][col]) {
    		check[row][col] = true;
    		cnt++;
    		dfs(row - 1, col);
    		dfs(row, col - 1);
    		dfs(row + 1, col);
    		dfs(row, col + 1);
    	}
    }
}
