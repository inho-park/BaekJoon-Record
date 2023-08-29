package set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class First_26069 {
	// 입력
	//  첫번째 줄에는 사람들이 만난 기록의 수 N (1 <= N <= 1000 )이 주어진다.
	//  두번째 줄부터 N개의 줄에 걸쳐 사람들이 만난 기록이 주어진다. i + 1번째 줄에는 i번째로 만난 사람들의 이름 A_i와 B_i가 공백을 사이에 두고 주어진다. 
	//  A_i와 B_i는 숫자와 영문 대소문자로 이루어진 최대 길이 20의 문자열이며, 서로 같지 않다.
	//  총총이의 이름은 ChongChong으로 주어지며, 기록에서 1회 이상 주어진다.
	//  동명이인은 없으며, 사람의 이름은 대소문자를 구분한다. (ChongChong과 chongchong은 다른 이름이다.)
	// 출력
	//	마지막 기록 이후 무지개 댄스를 추는 사람의 수를 출력하라.	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Set<String> dance = new HashSet<>(), nodance = new HashSet<>();
        dance.add("ChongChong");
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String a = st.nextToken(), b = st.nextToken();
            if (dance.contains(a) && !dance.contains(b)) {
            	dance.add(b);
            	nodance.remove(b);
            } else if (!dance.contains(a) && dance.contains(b)) {
            	dance.add(a);
            	nodance.remove(a);
            } else if (dance.contains(a) && dance.contains(b)){
            	continue;
            } else {
            	nodance.add(a);
            	nodance.add(b);
            }
        }
        System.out.println(dance.size());
	}
}
