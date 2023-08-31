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
	// �Է�
	//  ù° �ٿ��� ���� ������ ������ �ܾ��� ���� N�� �ܿ� �ܾ��� ���� ������ �Ǵ� M�� �������� ���еǾ� �־�����.
	//  ��° �ٺ��� N+1��° �ٱ��� �ܿ� �ܾ �Է¹޴´�. �̶��� �Է��� ���ĺ� �ҹ��ڷθ� �־����� �ܾ��� ���̴� 10�� ���� �ʴ´�.
	//  �ܾ��忡 �ܾ �ݵ�� 1�� �̻� �����ϴ� �Է¸� �־�����.
	// ���
	//	ȭ������ �ܾ��忡 ��� �ִ� �ܾ �ܾ����� �տ� ��ġ�� �ܾ���� �� �ٿ� �� �ܾ ������� ����Ѵ�.
	
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

