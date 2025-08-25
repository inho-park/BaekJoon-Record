package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_9063 {
	// �Է�
	//	ù° �ٿ��� ���� ���� N (1 �� N �� 100,000) �� �־�����. 
	//	�̾����� N �ٿ��� �� ���� ��ǥ�� �� ���� ������ �� �ٿ� �ϳ��� �־�����. ������ ��ǥ�� -10,000 �̻� 10,000 ������ �����̴�. 
	// ���
	//	ù° �ٿ� N ���� ���� �ѷ��δ� �ּ� ũ���� ���簢���� ���̸� ����Ͻÿ�. 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int maxRow = Integer.MIN_VALUE;
		int maxCol = Integer.MIN_VALUE;
		int minRow = Integer.MAX_VALUE;
		int minCol = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int row = Integer.parseInt(st.nextToken());
			int col = Integer.parseInt(st.nextToken());
			if (row > maxRow) maxRow = row;
			if (row < minRow) minRow = row;
			if (col > maxCol) maxCol = col;
			if (col < minCol) minCol = col;
		}
		System.out.print((maxRow - minRow) * (maxCol - minCol));
	}
}