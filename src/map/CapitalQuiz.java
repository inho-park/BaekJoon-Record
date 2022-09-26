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
		// �غ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n, rand;
		HashMap<String, String> map = new HashMap<>();		
		Vector<String> v = new Vector<>();
		map.put("�ѱ�", "����");
		map.put("ĳ����", "��Ÿ��");
		map.put("�Ϻ�", "����");
		map.put("�׸���", "���׳�");
		map.put("����ũ", "�����ϰ�");
		map.put("����", "īƮ����");
		map.put("��ũ���̳�", "Ű�̿�");
		map.put("������", "����");
		map.put("ȣ��", "ĵ����");
		map.put("�븣����", "������");
		v.add("�ѱ�");
		v.add("ĳ����");
		v.add("�Ϻ�");
		v.add("�׸���");
		v.add("����ũ");
		v.add("����");
		v.add("��ũ���̳�");
		v.add("������");
		v.add("ȣ��");
		v.add("�븣����");
		
		
		String country, input, ans;
		Random rd = new Random();
		System.out.println("���� ����");
		while(true) {
			System.out.print("�Է� : 1\t���� : 2\t���� : 3 >>> ");
			n = Integer.parseInt(br.readLine());
			
			// �Է�
			if (n==1) {
				System.out.println("���� �Էµ� ����,���� : "+map.size());
				while(true) {
					System.out.print("���� �� ���� �Է� (����� ����) "+(map.size()+1)+" :>>");
					input = br.readLine();
					// input �� �� �׸��� ��� �Է� ����
					if (input.equals("�׸�")) {
						break;
					}
					
					st = new StringTokenizer(input, " ");
					country = st.nextToken();
					v.add(country);
					map.put(country, st.nextToken());
				}
			}
			
			// ����
			else if (n==2) {
				while(true) {
					rand = rd.nextInt(0,v.size()-1);
					System.out.print(v.get(rand)+"�� ������? >>");
					ans = br.readLine();
					if (ans.equals("�׸�")) break;
					if (ans.equals(map.get(v.get(rand)))) System.out.println("����");
					else System.out.println("���� >>"+map.get(v.get(rand)));
					
				}
			}
			
			// ����
			else if (n==3) {
				System.out.println("System exit");
				break;
			}
			
			else {
				System.out.println("1~3 ������ ���� �Է�");
			}
		}
		
	}

}
