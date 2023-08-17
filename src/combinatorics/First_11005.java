package combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_11005 {
	// �Է�
	// 10���� �� N�� �־�����. �� ���� B�������� �ٲ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	// 10������ �Ѿ�� ������ ���ڷ� ǥ���� �� ���� �ڸ��� �ִ�. �̷� ��쿡�� ������ ���� ���ĺ� �빮�ڸ� ����Ѵ�.
		
	// ���
	// ù° �ٿ� 10���� �� N�� B�������� ����Ѵ�.

		static int n, b, temp;
		static String result = "";
		
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			n = Integer.parseInt(st.nextToken()); b = Integer.parseInt(st.nextToken());
			recursion();
			char charArr [] = result.toCharArray();
			for (int i = charArr.length - 1; i >= 0; i--) System.out.print(charArr[i]);
		}

		static void recursion() {
			if (n == 0) return;
			else {
				temp = n % b;
				n /= b;
				if (temp < 10) result += temp;
				else result += (char)(temp + 55);
				recursion();
			}
		}
	}
