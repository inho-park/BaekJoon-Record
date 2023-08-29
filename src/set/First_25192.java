package set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class First_25192 {
	// 입력
	//  첫 번째 줄에는 채팅방의 기록 수를 나타내는 정수 N 이 주어진다. 
	//  두 번째 줄부터 N 개의 줄에 걸쳐 새로운 사람의 입장을 나타내는 ENTER, 혹은 채팅을 입력한 유저의 닉네임이 문자열로 주어진다.
	//  첫 번째 주어지는 문자열은 무조건 ENTER이다.
	// 출력
	//	채팅 기록 중 곰곰티콘이 사용된 횟수를 출력하시오.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
        int num = 0;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.equals("ENTER")) {
                set.clear();
            } else {
                if (set.contains(s)) continue;
                set.add(s);
                num++;
            }
        }
        System.out.println(num);
	}
}

