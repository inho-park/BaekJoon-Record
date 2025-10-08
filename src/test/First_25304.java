package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_25304 {
	// �Է�
	//	ù° �ٿ��� �������� ���� �� �ݾ� X�� �־�����. ��° �ٿ��� �������� ���� ������ ������ ������ �� N�� �־�����.
	//	���� N���� �ٿ��� �� ������ ���� a�� ���� b�� ������ ���̿� �ΰ� �־�����.
	// ���
	//	������ ������ ���ݰ� ������ ����� �� �ݾ��� �������� ���� �� �ݾװ� ��ġ�ϸ� Yes�� ����Ѵ�. ��ġ���� �ʴ´ٸ� No�� ����Ѵ�.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine()); 
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			x -= Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()); 
		}
		System.out.print(x == 0 ? "Yes" : "No");
	}
}
