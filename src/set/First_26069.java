package set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class First_26069 {
	// �Է�
	//  ù��° �ٿ��� ������� ���� ����� �� N (1 <= N <= 1000 )�� �־�����.
	//  �ι�° �ٺ��� N���� �ٿ� ���� ������� ���� ����� �־�����. i + 1��° �ٿ��� i��°�� ���� ������� �̸� A_i�� B_i�� ������ ���̿� �ΰ� �־�����. 
	//  A_i�� B_i�� ���ڿ� ���� ��ҹ��ڷ� �̷���� �ִ� ���� 20�� ���ڿ��̸�, ���� ���� �ʴ�.
	//  �������� �̸��� ChongChong���� �־�����, ��Ͽ��� 1ȸ �̻� �־�����.
	//  ���������� ������, ����� �̸��� ��ҹ��ڸ� �����Ѵ�. (ChongChong�� chongchong�� �ٸ� �̸��̴�.)
	// ���
	//	������ ��� ���� ������ ���� �ߴ� ����� ���� ����϶�.	
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
