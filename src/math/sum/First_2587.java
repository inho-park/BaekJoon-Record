package math.sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class First_2587 {
	// �Է�
	//	ù° �ٺ��� �ټ� ��° �ٱ��� �� �ٿ� �ϳ��� �ڿ����� �־�����. �־����� �ڿ����� 100 ���� ���� 10�� ����̴�.
	// ���
	//	ù° �ٿ��� ����� ����ϰ�, ��° �ٿ��� �߾Ӱ��� ����Ѵ�. ��հ� �߾Ӱ��� ��� �ڿ����̴�.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr [] = new int [5];
		int total = 0;
		for (int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			total += arr[i];
			
		}
		Arrays.sort(arr);
		System.out.println(total/5);
		System.out.print(arr[2]);
	}
}