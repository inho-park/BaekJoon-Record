package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_1012 {
	// 입력
	//	입력의 첫 줄에는 테스트 케이스의 개수 T가 주어진다. 
	//	그 다음 줄부터 각각의 테스트 케이스에 대해 첫째 줄에는 배추를 심은 배추밭의 가로길이 M(1 ≤ M ≤ 50)과 세로길이 N(1 ≤ N ≤ 50), 
	//	그리고 배추가 심어져 있는 위치의 개수 K(1 ≤ K ≤ 2500)이 주어진다. 
	//	그 다음 K줄에는 배추의 위치 X(0 ≤ X ≤ M-1), Y(0 ≤ Y ≤ N-1)가 주어진다. 두 배추의 위치가 같은 경우는 없다.
	// 출력
	//	각 테스트 케이스에 대해 필요한 최소의 배추흰지렁이 마리 수를 출력한다.
	static int t, m, n, k, cnt = 0, total_cnt = 0;
	static boolean check [][], arr [][];
	static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	m = Integer.parseInt(st.nextToken());
        	n = Integer.parseInt(st.nextToken());
        	k = Integer.parseInt(st.nextToken());
        	arr = new boolean [n + 2][m + 2];
        	check = new boolean [n + 2][m + 2];
        	
        	for (int j = 0; j < k; j++) {
        		st = new StringTokenizer(br.readLine(), " ");
        		int x = Integer.parseInt(st.nextToken()) + 1;
        		int y = Integer.parseInt(st.nextToken()) + 1;
        		arr[y][x] = true;
        	}
        	
        	for (int j = 1; j < n + 1; j++) {
        		for (int x = 1; x < m + 1; x++) {
        			dfs(j, x);
        			if (cnt != 0) {
        				total_cnt++;
        				cnt = 0;
        			}
        		}
        	}
        	sb.append(total_cnt).append("\n");
        	total_cnt = 0;
        }
        System.out.print(sb);
    }
    
    static void dfs(int row, int col) {
    	if (col > m + 1 || col < 1) return;
    	if (row > n + 1 || row < 1) return;
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
