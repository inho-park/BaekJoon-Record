package vector;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Vector;

public class WordQuiz {

	public static void main(String[] args) throws IOException {
		// 준비물
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		Random rd = new Random();
		Vector<Integer> vi = new Vector<>();
		int n, ans, problem;
		Vector<Word> v = new Vector<Word>();
		
		v.add(new Word("그림","painting"));
		v.add(new Word("감정","filling"));
		v.add(new Word("아기","baby"));
		v.add(new Word("오류","error"));
		v.add(new Word("사회","society"));
		v.add(new Word("인형","doll"));
		v.add(new Word("곰","bear"));
		v.add(new Word("나무","tree"));
		v.add(new Word("유진","YuJin"));
		v.add(new Word("인간","human"));
		
		while (true) {
			System.out.print("단어 테스트 : 1\t 단어 삽입 : 2\t 종료 : 3  >>");
			String command = br.readLine();
			// 단어 테스트 시작
			if (command.equals("1")) {
				System.out.println("현재 "+v.capacity()+"개의 단어가 들어 있습니다 -1 을 입력 시 종료함다");
				while (true) {
					// 문제를 저장할 StringBuilder 객체 초기화
					sb = new StringBuilder();
					
					// 보기란을 정답을 포함해 랜덤하게 내기 위한 벡터에 난수값 추가
					for (int i=0;i<4;i++) {
						n = rd.nextInt(0,v.capacity());
						if (vi.contains(n)) i--;
						else vi.add(n);
					}
					
					// 4지 선다 중 하나 지정 -> 문제
					problem = rd.nextInt(0,3);
					
					// 문제로 정한 4지 선다 중 한요소에 해당하는 v 벡터 요소의 english 변수를 가져옴
					sb.append(v.get(vi.get(problem)).english+" ?").append("\n");
					
					// vi 즉 4다선지에 낼 Word 객체의 korean 변수를 출력
					for (int i=0;i<4;i++) {
						sb.append("( "+(i+1)+" )"+v.get(vi.get(i)).korean+" ");
					}
					sb.append(" :>");
					System.out.print(sb);
					
					// 정답 번호를 입력
					ans = Integer.parseInt(br.readLine());
					
					// 만약 -1 입력 시 종료
					if (ans==-1) {
						System.out.println("Exit");
						break;
					}
					
					// 정답이 맞출 시 출력
					else if (v.get(vi.get(problem))==v.get(vi.get(ans-1))) System.out.println("Excellent");
					
					// 정답이 틀릴 시 출력
					else System.out.println("No");
					
					// while 문이 끝날 시 vi vector 전부 제거 -> 즉 4지선다 삭제
					vi.removeAll(vi);
				}	
			}
			
			// 단어 삽입
			else if (command.equals("2")) {
				System.out.println("그만 입력 시 종료");
				String words [] = new String [2];
				while (true) {
					System.out.print("영어 한글 입력 >>");
					words = br.readLine().split(" ");
					v.add(new Word(words[1], words[0]));
				}
			}

			else if (command.equals("3")) {
				System.out.println("종료");
				break;
			}
			else System.out.println("메롱");
		}
	}	
}
