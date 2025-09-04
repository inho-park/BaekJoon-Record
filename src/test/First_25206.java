package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class First_25206 {
	// 입력
	//	20줄에 걸쳐 치훈이가 수강한 전공과목의 과목명, 학점, 등급이 공백으로 구분되어 주어진다.
	// 출력
	//	치훈이의 전공평점을 출력한다.
	//	정답과의 절대오차 또는 상대오차가 10^(-4) 이하이면 정답으로 인정한다.
	public static void main(String[] args) throws IOException {
		Map<String, Float> map = new HashMap<>();
		map.put("A+", 4.5f);
		map.put("A0", 4.0f);
		map.put("B+", 3.5f);
		map.put("B0", 3.0f);
		map.put("C+", 2.5f);
		map.put("C0", 2.0f);
		map.put("D+", 1.5f);
		map.put("D0", 1.0f);
		map.put("F", 0.0f);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		float numer = 0;
		float denom = 0;
		StringTokenizer st;
		for (int i = 0; i < 20; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String temp = st.nextToken();
			float point = Float.parseFloat(st.nextToken());
			String str = st.nextToken();
			if (str.equals("P")) 
				continue;
			denom += point;
			float score = map.get(str);
			numer += point * score;
		}
		float result = numer/denom;
		System.out.println(result);
	}
}