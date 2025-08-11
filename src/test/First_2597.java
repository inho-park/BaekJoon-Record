package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_2597 {
	// 입력
	//	첫째 줄에 줄자의 길이가 입력된다. 줄자의 길이는 10㎝ 이상, 1,000㎝ 이하이고 단위를 나타내는 ㎝은 입력되지 않는다. 
	//	둘째 줄에는 두 빨간 점의 위치를 나타내는 정수가 빈칸을 사이에 두고 입력된다. 
	//	셋째 줄에는 두 파란 점의 위치가, 넷째 줄에는 두 노란 점의 위치를 나타내는 정수가 빈칸을 사이에 두고 입력된다. 모든 점들의 위치는 서로 다르다.
	// 출력
	//	한 줄에 접은 후의 줄자의 길이를 소수점 이하 한자리까지 출력한다. 소수점 이하 한자리가 0 이면 0 도 출력한다.(예 4.0)
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
