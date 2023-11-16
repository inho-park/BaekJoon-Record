package math.combinatoric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Second_2981 {
	// Say
	// A1 = M * a1 + r1
	// A2 = M * a2 + r2
	// and if r1=r2
	// A1 - A2 = M(a1 - a2)
	// and that problem gives numbers has one answer at least
	// that means
	// 6/M+r , 34/M+r, 38/M+r
	// same as above, you can define new formula
	// and you can find more simply  formula like
	// that answer has same remainder each other
	// so through application new formula
	// (34-6)/M and (38-34)/M have same common denominator, if says remainder is same
	public static void main(String[] args) throws IOException{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int arr [] = new int [n];
		for (int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		int gcd = arr[1]-arr[0];
		for (int i=2;i<n;i++) {
			gcd=getGcd(gcd,arr[i]-arr[i-1]);
		}
	
		for (int i = 2;i < gcd/2; i++) {
			if (gcd%i==0) sb.append(i+" ");
		}
		sb.append(gcd);
		System.out.print(sb);
	}
	
	
	static int getGcd(int a, int b) {
		while(b!=0) {
			int r = a%b;
			a = b;
			b = r;
		}
		return a;
	}
}
