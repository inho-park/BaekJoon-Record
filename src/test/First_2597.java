package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_2597 {
	// �Է�
	//	ù° �ٿ� ������ ���̰� �Էµȴ�. ������ ���̴� 10�� �̻�, 1,000�� �����̰� ������ ��Ÿ���� ���� �Էµ��� �ʴ´�. 
	//	��° �ٿ��� �� ���� ���� ��ġ�� ��Ÿ���� ������ ��ĭ�� ���̿� �ΰ� �Էµȴ�. 
	//	��° �ٿ��� �� �Ķ� ���� ��ġ��, ��° �ٿ��� �� ��� ���� ��ġ�� ��Ÿ���� ������ ��ĭ�� ���̿� �ΰ� �Էµȴ�. ��� ������ ��ġ�� ���� �ٸ���.
	// ���
	//	�� �ٿ� ���� ���� ������ ���̸� �Ҽ��� ���� ���ڸ����� ����Ѵ�. �Ҽ��� ���� ���ڸ��� 0 �̸� 0 �� ����Ѵ�.(�� 4.0)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float arr [][] = new float [3][2];
        float n = Integer.parseInt(br.readLine());
        for (int i = 0; i < 3; i++) {        	
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	arr[i][0] = Integer.parseInt(st.nextToken());
        	arr[i][1] = Integer.parseInt(st.nextToken());
        }
        
        for (int i = 0; i < 3; i++) {
        	if (arr[i][0] == arr[i][1]) continue;
        	float mid = (arr[i][0] + arr[i][1])/2;
        	if (mid < n - mid) {        		
        		for (int j = i + 1; j < 3; j++) {
        			if (arr[j][0] < mid) arr[j][0] = mid - arr[j][0];
        			else arr[j][0] -= mid;
        			if (arr[j][1] < mid) arr[j][1] = mid - arr[j][1];
        			else arr[j][1] -= mid;
        			
        			if (arr[j][0] > arr[j][1]) {
        				float temp = arr[j][0];
        				arr[j][0] = arr[j][1];
        				arr[j][1] = temp;
        			}
        		}
        		n = n - mid;
        	} else {
        		for (int j = i + 1; j < 3; j++) {
        			if (arr[j][0] > mid) arr[j][0] = mid - (arr[j][0] - mid);
        			if (arr[j][1] > mid) arr[j][1] = mid - (arr[j][1] - mid);
        			
    				if (arr[j][0] > arr[j][1]) {
        				float temp = arr[j][0];
        				arr[j][0] = arr[j][1];
        				arr[j][1] = temp;
        			}
        		}
        		n = mid;
        	}
        }
        System.out.print(n);
    }
}
