package backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FIrst_9663 {
	// dfs
	// 퀸의 좌표를 (x,y) 라 가정하고, 퀸의 공격 경로는 정수 n 이 주어졌을 때,
	//	(x+n,y),(x,y+n),(x+n,y+n) 3가지의 공격 경로가 나온다
	// 즉 퀸들끼리 위협이 되지 않게 두기 위해서 3가지의 경우를 따져야 하는데
	// 1차원 정수 배열을 사용하여 서로 다른 값을 가지게 되면 좌표계의 한축은 저절로 해결이 되게 할 수 있으므로
	// 다른 한축과 대각 (x+n,y+n) 의 경우를 고려하여 depth 가 주어진 변수 n 에 도달하였을 시에 count 를 증가시키는 방향으로 구현
	static int arr [];
	static int n;
	static int count = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int [n+1];
		Queen(0);
		System.out.println(count);
	}
	static void Queen(int depth) {
		if (n==depth) {
			count++;
			return;
		}
		
		for (int i=1;i<n+1;i++) {
			arr[depth] = i;
			if (Bool(depth)) Queen(depth+1);
		}
	}

	
	static boolean Bool(int depth) {
		for (int i=0;i<depth;i++) {
			if (arr[depth]==arr[i]) return false;
			
			else if (Math.abs(depth-i)==Math.abs(arr[depth]-arr[i])) return false;
		}
		
		return true;
	}
}