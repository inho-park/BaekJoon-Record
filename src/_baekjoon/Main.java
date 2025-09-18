package _baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	// 입력
	//	첫째 줄에는 전체 용액의 수 N이 입력된다. N은 2 이상 100,000 이하이다. 
	//	둘째 줄에는 용액의 특성값을 나타내는 N개의 정수가 빈칸을 사이에 두고 주어진다. 이 수들은 모두 -1,000,000,000 이상 1,000,000,000 이하이다. 
	//	N개의 용액들의 특성값은 모두 다르고, 산성 용액만으로나 알칼리성 용액만으로 입력이 주어지는 경우도 있을 수 있다.
	// 출력
	//	첫째 줄에 특성값이 0에 가장 가까운 용액을 만들어내는 두 용액의 특성값을 출력한다. 출력해야 하는 두 용액은 특성값의 오름차순으로 출력한다. 
	//	특성값이 0에 가장 가까운 용액을 만들어내는 경우가 두 개 이상일 경우에는 그 중 아무것이나 하나를 출력한다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int arr [] = new int [n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int i = 0, j = n - 1, min = Integer.MAX_VALUE;
		int I = n - 1, J = 0;
		while(i < j) {
			int x = arr[i] + arr[j];
			int abs = Math.abs(x);
			
			if(min > abs) {
				I = i;
				J = j;
				if (abs == 0) break;
				min = abs;
			}
			
			if (x < 0) i++;
			else j--;
		}
		System.out.print(arr[I] + " " + arr[J]);
	}
}
