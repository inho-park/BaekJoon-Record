package backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_14888 {
	static StringBuilder sb = new StringBuilder();
	static int numArr [], op [], max = -1000000000, min = 1000000000;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		numArr = new int [n];
		for (int i = 0; i < n; i++) numArr[i] = Integer.parseInt(st.nextToken());
		// 전역 변수에 for 문을 아래와 같이 활용할 시 for 문 안에서만 i 의 초기화가 적용되고 전역 변수에 영향을 주지않는다 *****
		//for(int i:numArr) i = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		op = new int [4];
		for (int i = 0; i < 4; i++) op[i] = Integer.parseInt(st.nextToken());
		//for(int i:op) i = Integer.parseInt(st.nextToken());
		
		setOp(numArr[0],1,n);
		System.out.println(max);
		System.out.print(min);
	}
	
	static void setOp(int num, int idx, int n) {
		if (n == idx) {
			if (max<num) max=num;
			if (min>num) min=num;
			return;
		}
		for (int i=0;i<4;i++) {
			if (op[i]>0) {
				op[i]--;
				if (i==0) setOp(num+numArr[idx],idx+1,n);
				else if (i==1) setOp(num-numArr[idx],idx+1,n);
				else if (i==2) setOp(num*numArr[idx],idx+1,n);
				else if (i==3) setOp(num/numArr[idx],idx+1,n);				
				op[i]++;
			}
		}
	}
	
}