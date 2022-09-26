package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.Vector;

public class CapitalQuiz {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 준비물
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n, rand;
		HashMap<String, String> map = new HashMap<>();		
		Vector<String> v = new Vector<>();
		map.put("한국", "서울");
		map.put("캐나다", "오타와");
		map.put("일본", "도쿄");
		map.put("그리스", "아테네");
		map.put("덴마크", "코펜하겐");
		map.put("네팔", "카트만두");
		map.put("우크라이나", "키이우");
		map.put("스위스", "베른");
		map.put("호주", "캔버라");
		map.put("노르웨이", "오슬로");
		v.add("한국");
		v.add("캐나다");
		v.add("일본");
		v.add("그리스");
		v.add("덴마크");
		v.add("네팔");
		v.add("우크라이나");
		v.add("스위스");
		v.add("호주");
		v.add("노르웨이");
		
		
		String country, input, ans;
		Random rd = new Random();
		System.out.println("게임 시작");
		while(true) {
			System.out.print("입력 : 1\t퀴즈 : 2\t종료 : 3 >>> ");
			n = Integer.parseInt(br.readLine());
			
			// 입력
			if (n==1) {
				System.out.println("현재 입력된 나라,수도 : "+map.size());
				while(true) {
					System.out.print("나라 및 수도 입력 (띄어쓰기로 구분) "+(map.size()+1)+" :>>");
					input = br.readLine();
					// input 값 이 그만일 경우 입력 종료
					if (input.equals("그만")) {
						break;
					}
					
					st = new StringTokenizer(input, " ");
					country = st.nextToken();
					v.add(country);
					map.put(country, st.nextToken());
				}
			}
			
			// 퀴즈
			else if (n==2) {
				while(true) {
					rand = rd.nextInt(0,v.size()-1);
					System.out.print(v.get(rand)+"의 수도는? >>");
					ans = br.readLine();
					if (ans.equals("그만")) break;
					if (ans.equals(map.get(v.get(rand)))) System.out.println("정답");
					else System.out.println("오답 >>"+map.get(v.get(rand)));
					
				}
			}
			
			// 종료
			else if (n==3) {
				System.out.println("System exit");
				break;
			}
			
			else {
				System.out.println("1~3 까지의 숫자 입력");
			}
		}
		
	}

}
