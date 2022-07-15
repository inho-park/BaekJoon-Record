package set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class First_1269 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		HashSet<String> arr = new HashSet<>();
		HashSet<String> arr2 = new HashSet<>();
		st = new StringTokenizer(br.readLine());
		while(n-->0) {
			arr.add(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		while(m-->0) {
			String num = st.nextToken();
			if (arr.contains(num)) { 
				arr.remove(num);
			}
			else {
				arr2.add(num);
			}
		}
		System.out.print(arr.size()+arr2.size());
	
	}

}
