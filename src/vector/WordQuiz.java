package vector;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Vector;

public class WordQuiz {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// �غ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		Random rd = new Random();
		Vector<Integer> vi = new Vector<>();
		int n, ans, problem;
		Vector<Word> v = new Vector<Word>();
		
		v.add(new Word("�׸�","painting"));
		v.add(new Word("����","filling"));
		v.add(new Word("�Ʊ�","baby"));
		v.add(new Word("����","error"));
		v.add(new Word("��ȸ","society"));
		v.add(new Word("����","doll"));
		v.add(new Word("��","bear"));
		v.add(new Word("����","tree"));
		v.add(new Word("����","YuJin"));
		v.add(new Word("�ΰ�","human"));
		
		while (true) {
			// ������ ������ StringBuilder ��ü �ʱ�ȭ
			sb = new StringBuilder();
			
			// ������� ������ ������ �����ϰ� ���� ���� ���Ϳ� ������ �߰�
			for (int i=0;i<4;i++) {
				n = rd.nextInt(0,9);
				if (vi.contains(n)) i--;
				else vi.add(n);
			}
			
			// 4�� ���� �� �ϳ� ���� -> ����
			problem = rd.nextInt(0,3);
			
			// ������ ���� 4�� ���� �� �ѿ�ҿ� �ش��ϴ� v ���� ����� english ������ ������
			sb.append(v.get(vi.get(problem)).english+" ?").append("\n");
			
			// vi �� 4�ټ����� �� Word ��ü�� korean ������ ���
			for (int i=0;i<4;i++) {
				sb.append("( "+(i+1)+" )"+v.get(vi.get(i)).korean+" ");
			}
			sb.append(" :>");
			System.out.print(sb);
			
			// ���� ��ȣ�� �Է�
			ans = Integer.parseInt(br.readLine());
			
			// ���� -1 �Է� �� ����
			if (ans==-1) {
				System.out.print("Exit");
				break;
			}
			
			// ������ ���� �� ���
			else if (v.get(vi.get(problem))==v.get(vi.get(ans-1))) System.out.println("Excellent");
			
			// ������ Ʋ�� �� ���
			else System.out.println("No");
			
			// while ���� ���� �� vi vector ���� ���� -> �� 4������ ����
			vi.removeAll(vi);
		}	
	}
}
