package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class First_20920 {
	// 입력
	//  첫째 줄에는 영어 지문에 나오는 단어의 개수 N과 외울 단어의 길이 기준이 되는 M이 공백으로 구분되어 주어진다.
	//  둘째 줄부터 N+1번째 줄까지 외울 단어를 입력받는다. 이때의 입력은 알파벳 소문자로만 주어지며 단어의 길이는 10을 넘지 않는다.
	//  단어장에 단어가 반드시 1개 이상 존재하는 입력만 주어진다.
	// 출력
	//	화은이의 단어장에 들어 있는 단어를 단어장의 앞에 위치한 단어부터 한 줄에 한 단어씩 순서대로 출력한다.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
        	String word = br.readLine();
        	if (word.length() < m) continue;
        	if (map.containsKey(word)) map.put(word, map.get(word)+1);
        	else map.put(word, 1);
        }
        
        List<String> words = map.keySet().stream().collect(Collectors.toList());
        
        words.sort((o1, o2) -> {
        	if (map.get(o1) == map.get(o2)) {
        		if (o1.length() == o2.length()) return o1.compareTo(o2);
        		return o2.length() - o1.length();
        	}
        	return map.get(o2) - map.get(o1);
        });
        
        for (String word: words) sb.append(word).append("\n");
        System.out.print(sb);
	}
}

