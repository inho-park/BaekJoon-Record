package backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_4779 {
	// �Է�
	//  �Է��� ���� �ٷ� �̷���� �ִ�. �� �ٿ� N�� �־�����. ������ ������ �Է��� �����. N�� 0���� ũ�ų� ����, 12���� �۰ų� ���� �����̴�.
	// ���
	//	�Է����� �־��� N�� ���ؼ�, �ش��ϴ� ĭ��� ������ �ٻ縦 ����Ѵ�.
	static boolean arr[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		int cnt;
		while((str = br.readLine()) != null) {
			cnt = (int)Math.pow(3, Integer.parseInt(str));
			arr = new boolean [cnt];
			solve(0, cnt);
			for (int i = 0; i < cnt; i++) sb.append(arr[i]?" ":"-");
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	public static void solve(int first, int len) { 
		if (len < 3) return;
		
		for (int i = first + len/3; i < first + len/3*2; i++) arr[i] = true;
		solve(first, len/3);
		solve(first + len/3 * 2, len/3);
	}
}
