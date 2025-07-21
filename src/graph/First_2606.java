package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_2606 {
	// �Է�
	//	ù° �ٿ��� ��ǻ���� ���� �־�����. ��ǻ���� ���� 100 ������ ���� �����̰� �� ��ǻ�Ϳ��� 1�� ���� ���ʴ�� ��ȣ�� �Ű�����. 
	//	��° �ٿ��� ��Ʈ��ũ �󿡼� ���� ����Ǿ� �ִ� ��ǻ�� ���� ���� �־�����. 
	//	�̾ �� ����ŭ �� �ٿ� �� �־� ��Ʈ��ũ �󿡼� ���� ����Ǿ� �ִ� ��ǻ���� ��ȣ ���� �־�����.
	// ���
	//	1�� ��ǻ�Ͱ� �� ���̷����� �ɷ��� ��, 1�� ��ǻ�͸� ���� �� ���̷����� �ɸ��� �Ǵ� ��ǻ���� ���� ù° �ٿ� ����Ѵ�.
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