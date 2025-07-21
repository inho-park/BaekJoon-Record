package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_2606 {
	// 입력
	//	첫째 줄에는 컴퓨터의 수가 주어진다. 컴퓨터의 수는 100 이하인 양의 정수이고 각 컴퓨터에는 1번 부터 차례대로 번호가 매겨진다. 
	//	둘째 줄에는 네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수가 주어진다. 
	//	이어서 그 수만큼 한 줄에 한 쌍씩 네트워크 상에서 직접 연결되어 있는 컴퓨터의 번호 쌍이 주어진다.
	// 출력
	//	1번 컴퓨터가 웜 바이러스에 걸렸을 때, 1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수를 첫째 줄에 출력한다.
	static int arr [][], cnt = 0;
	static boolean check [];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        
        arr = new int [n + 1][n + 1];
        check = new boolean [n + 1];
        
        for (int i = 0; i < m; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int start = Integer.parseInt(st.nextToken());
        	int end = Integer.parseInt(st.nextToken());
        	
        	arr[start][end] = 1;
        	arr[end][start] = 1;
        }
        
        dfs(1);
        
        for(int i = 1; i < n + 1; i ++) {
        	if (check[i]) cnt++;
        }
        System.out.print(cnt - 1);
    }
    
    static void dfs(int start) {
    	check[start] = true;
		for (int i = 0; i < arr.length; i++) {
			if (!check[i] && arr[start][i] == 1) {
				dfs(i);
			}
		}
    }
}