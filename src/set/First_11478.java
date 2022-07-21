package set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class First_11478 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> set = new HashSet<>();
		String str = br.readLine();
		for (int i=0;i<str.length();i++) {
			for (int j=i;j<str.length();j++) {
				set.add(str.substring(i,j+1));
			}
		}
		System.out.print(set.size());
	}
}
