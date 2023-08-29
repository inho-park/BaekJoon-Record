package set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class First_25192 {
	// �Է�
	//  ù ��° �ٿ��� ä�ù��� ��� ���� ��Ÿ���� ���� N �� �־�����. 
	//  �� ��° �ٺ��� N ���� �ٿ� ���� ���ο� ����� ������ ��Ÿ���� ENTER, Ȥ�� ä���� �Է��� ������ �г����� ���ڿ��� �־�����.
	//  ù ��° �־����� ���ڿ��� ������ ENTER�̴�.
	// ���
	//	ä�� ��� �� ����Ƽ���� ���� Ƚ���� ����Ͻÿ�.
	
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

