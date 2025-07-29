package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_1012 {
	// �Է�
	//	�Է��� ù �ٿ��� �׽�Ʈ ���̽��� ���� T�� �־�����. 
	//	�� ���� �ٺ��� ������ �׽�Ʈ ���̽��� ���� ù° �ٿ��� ���߸� ���� ���߹��� ���α��� M(1 �� M �� 50)�� ���α��� N(1 �� N �� 50), 
	//	�׸��� ���߰� �ɾ��� �ִ� ��ġ�� ���� K(1 �� K �� 2500)�� �־�����. 
	//	�� ���� K�ٿ��� ������ ��ġ X(0 �� X �� M-1), Y(0 �� Y �� N-1)�� �־�����. �� ������ ��ġ�� ���� ���� ����.
	// ���
	//	�� �׽�Ʈ ���̽��� ���� �ʿ��� �ּ��� ������������ ���� ���� ����Ѵ�.
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
