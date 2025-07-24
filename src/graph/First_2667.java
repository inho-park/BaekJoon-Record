package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class First_2667 {
	// �Է�
	//	ù ��° �ٿ��� ������ ũ�� N(���簢���̹Ƿ� ���ο� ������ ũ��� ������ 5��N��25)�� �Էµǰ�, �� ���� N�ٿ��� ���� N���� �ڷ�(0Ȥ�� 1)�� �Էµȴ�.
	// ���
	//	ù ��° �ٿ��� �� �������� ����Ͻÿ�. �׸��� �� ������ ���� ���� ������������ �����Ͽ� �� �ٿ� �ϳ��� ����Ͻÿ�.
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
