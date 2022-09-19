package vector;

import java.util.Scanner;
import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		// 준비물
		Scanner sc = new Scanner(System.in);
		// 벡터 생ㅋ성ㅋ
		Vector<Integer> vt = new Vector<>();
		int n;
		
		while (true) {
			n = sc.nextInt();
			if (n==-1) {
				vt.sort(null);
				System.out.print(vt.get(vt.size()-1));
				break;
			}
			vt.add(n);
		}
		sc.close();
	}
}
