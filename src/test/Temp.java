package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Temp {
	public static void main(String[] args) throws IOException {
		int fees [] = {180, 5000, 10, 600};
		String records [] = {};
		int [] result = solutions(fees, records);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	}
	
	static int [] solutions(int [] fees, String [] records) {
		Map<Integer, Integer> sum = new HashMap<>();
		Map<Integer, Integer> inList = new HashMap<>();
		
		for (String str : records) {
			StringTokenizer st = new StringTokenizer(str, " ");
			String time = st.nextToken();
			int num = Integer.parseInt(st.nextToken());
			boolean flag = st.nextToken().equals("IN");
			
		}
		int [] result = new int [inList.size()];
		
		
		return result;
	}
}