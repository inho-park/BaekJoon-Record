package backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FIrst_9663 {
	// dfs
	// ���� ��ǥ�� (x,y) �� �����ϰ�, ���� ���� ��δ� ���� n �� �־����� ��,
	//	(x+n,y),(x,y+n),(x+n,y+n) 3������ ���� ��ΰ� ���´�
	// �� ���鳢�� ������ ���� �ʰ� �α� ���ؼ� 3������ ��츦 ������ �ϴµ�
	// 1���� ���� �迭�� ����Ͽ� ���� �ٸ� ���� ������ �Ǹ� ��ǥ���� ������ ������ �ذ��� �ǰ� �� �� �����Ƿ�
	// �ٸ� ����� �밢 (x+n,y+n) �� ��츦 ����Ͽ� depth �� �־��� ���� n �� �����Ͽ��� �ÿ� count �� ������Ű�� �������� ����
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