package lambda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class LambdaEx {
	
	// 좌표의 x축 오름차순 다음 y축 오름차순으로 정렬
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int [][] arr = new int [n][2];
		for (int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		// Interface Implementation
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if (o1[0]==o2[0]) return o1[1]-o2[1];
				else return o1[0]-o2[0];
			}
		});
		
		// Lambda Application
		Arrays.sort(arr, (o1,o2) -> {
			if (o1[0]==o2[0]) return o1[1]-o2[1];
			else return o1[0]-o2[0];
		});
		
		for (int i = 0; i<n; i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
	}
}
