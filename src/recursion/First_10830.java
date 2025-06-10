package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_10830 {
	// 입력
	//	첫째 줄에 행렬의 크기 N과 B가 주어진다. (2 ≤ N ≤  5, 1 ≤ B ≤ 100,000,000,000)
	//	둘째 줄부터 N개의 줄에 행렬의 각 원소가 주어진다. 행렬의 각 원소는 1,000보다 작거나 같은 자연수 또는 0이다.
	// 출력
	//	첫째 줄에 괄호를 적절히 쳐서 값을 최소로 만들었을 때, 정답을 출력한다.
	
	static int n;
	static int [][] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		n = Integer.parseInt(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		arr = new int [n][n];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken()) % 1000;
			}
		}
		int[][] result = recursion(arr, b);
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				sb.append(result[i][j]).append(' ');
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
	
	static int [][] recursion(int [][] a, long exponent) {
		if (exponent == 1) {
			return a;
		}
		
		int [][] temp = recursion(a, exponent/2);
		
		temp = multiply(temp, temp);
		if (exponent % 2 == 1) {
			temp = multiply(temp, arr);
		}
		
		return temp;
	}
	
	public static int[][] multiply(int[][] arr1, int[][] arr2) {
		
		int[][] temp = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < n; k++) {
					
					temp[i][j] += arr1[i][k] * arr2[k][j];
					temp[i][j] %= 1000;
				}
			}
		}
		return temp;
	}
}