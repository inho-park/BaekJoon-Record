package combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class First_2981 {
// this answer is wrong because it doesn't take the greatest common denominator
// lack of the understanding about problem
	public static void main(String[] args) throws IOException{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int arr [] = new int [n];
		for (int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		int temp, cnt=1;
		for (int i=2;i<=arr[0];i++) {
			temp = arr[0]%i;
			for (int j=1;j<n;j++) {
				if (temp!=arr[j]%i) break;
				else {
					cnt++;
					temp=arr[j]%i;
				}
			}
			if (cnt==n) {
				sb.append(i+" ");
				cnt=1;
			}
		}
		System.out.print(sb);
	}
}