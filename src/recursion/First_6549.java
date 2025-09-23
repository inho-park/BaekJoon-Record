package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_6549 {
	// 입력
	//	입력은 테스트 케이스 여러 개로 이루어져 있다. 각 테스트 케이스는 한 줄로 이루어져 있고, 
	//	직사각형의 수 n이 가장 처음으로 주어진다. (1 ≤ n ≤ 100,000) 
	//	그 다음 n개의 정수 h1, ..., hn (0 ≤ hi ≤ 1,000,000,000)가 주어진다. 
	//	이 숫자들은 히스토그램에 있는 직사각형의 높이이며, 왼쪽부터 오른쪽까지 순서대로 주어진다. 
	//	모든 직사각형의 너비는 1이고, 입력의 마지막 줄에는 0이 하나 주어진다.
	// 출력
	//	각 테스트 케이스에 대해서, 히스토그램에서 가장 넓이가 큰 직사각형의 넓이를 출력한다.
	// 틀린 부분
	// 	getArea 함수의 height변수를 int로 선언
	// 	=> 처음에는 문제가 없지만 int의 바이너리 범위를 넘어서는 수치가 height으로 할당될 시 Overflow 발생
	static int [] arr;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			if (n == 0) break;
			arr = new int [n];
			
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			sb.append(recursion(0, n - 1)).append("\n");
		}
		
		System.out.print(sb);
	}
	
	static long recursion(int low, int high) {
		if (low == high) return arr[low];
		
		int mid = (low + high) / 2;
		long left = recursion(low, mid);
		long right = recursion(mid + 1, high);
		
		long result = right > left ? right : left;
		long extent = getArea(low, high, mid);
		return result > extent ? result : extent;
	}
	
	static long getArea(int low, int high, int mid) {
		int left = mid;
		int right = mid;
		int height = arr[mid];
		
		long result = height;
		
		while(low < left && right < high) {
			if (arr[left - 1] >= arr[right + 1]) {
				left--;
				height = height > arr[left] ? arr[left] : height;
			} else {
				right++;
				height = height > arr[right] ? arr[right] : height;
			}
			long temp = (right - left + 1) * height;
			result = result > temp ? result : temp;
		}
		
		while(low < left) {
			left--;
			height = height > arr[left] ? arr[left] : height;
			long temp = (right - left + 1) * height;
			result = result > temp ? result : temp;
		}
		while(right < high) {
			right++;
			height = height > arr[right] ? arr[right] : height;
			long temp = (right - left + 1) * height;
			result = result > temp ? result : temp;
		}
		
		return result;
	}
}
