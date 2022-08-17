package combinatorics;

import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
 
public class Factorial_test {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.println("0���� �Է¹��� ������ ���丮�� ���� ������ݴϴ�.");
		System.out.println("�� ��°���� ���丮�� ���� ������ �Է����ּ���.\n");
		System.out.print("Input N : ");
		
		long j = Long.parseLong(br.readLine().trim());
		
		BigInteger a = BigInteger.ONE;
		
		bw.write("0! = " + a.toString() + "\n");
		for(int i = 1; i <= j; i++) {
			a = a.multiply(new BigInteger(String.valueOf(i)));
			bw.write(i + "! = " + a.toString() + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}
