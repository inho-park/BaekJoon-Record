package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Second_10815 {
	static int arr[];
	static int n,m;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int [n];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for (int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		for (int i=0;i<m;i++) {
			if (Search(Integer.parseInt(st.nextToken()))) sb.append(1+" ");
			else sb.append(0+" ");
		}
		System.out.print(sb);
	}
	
	
	private static boolean Search(int num) {
		int left = 0;
		int right = n-1;
		
		while (left <= right) {
			int mid = (left+right)/2;
			int pivot = arr[mid];
			
			if (num<pivot) right = mid-1;
			else if (num>pivot) left = mid+1;
			else return true;
		}
		return false;
	}

}
