package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class _10815 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Input
		//ù° �ٿ� ����̰� ������ �ִ� ���� ī���� ���� N(1 �� N �� 500,000)�� �־�����. 
		//��° �ٿ��� ���� ī�忡 �����ִ� ������ �־�����. ���� ī�忡 �����ִ� ���� -10,000,000���� ũ�ų� ����, 10,000,000���� �۰ų� ����. 
		//�� ���� ī�忡 ���� ���� �����ִ� ���� ����.
		//��° �ٿ��� M(1 �� M �� 500,000)�� �־�����. 
		//��° �ٿ��� ����̰� ������ �ִ� ���� ī������ �ƴ����� ���ؾ� �� M���� ������ �־�����, �� ���� �������� ���еǾ��� �ִ�. 
		//�� ���� -10,000,000���� ũ�ų� ����, 10,000,000���� �۰ų� ����
		
		//Output
		//ù° �ٿ� �Է����� �־��� M���� ���� ���ؼ�, �� ���� ���� ���� ī�带 ����̰� ������ ������ 1��, �ƴϸ� 0�� �������� ������ ����Ѵ�.
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		// It says two cards don't have the same value, so we can use ArrayList, of course Set doesn't matter
		// And, i will use ArrayList, not LinkedList
		// Because we LinkedList need more memory to link each values
		// But we don't need more memory like LinkedList, 
		// And LinkedList is slower with finding values in List than ArrayList
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i=0;i<n;i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		int n2 = Integer.parseInt(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
		// For here, we should make Map object
		// And we will put data to Map
		// like if ArrayList has the data already, data to key, 1 to value,
		// else, data to key, 0 to value
		Map<Integer, Integer> ans = new HashMap<>();
		int key;
		int [] arr2 = new int[n2];
		for (int i=0;i<n2;i++) {
			key=Integer.parseInt(st2.nextToken());
			arr2[i]=key;
			if (arr.contains(key)) ans.put(key, 1);
			else ans.put(key, 0);
		}
		StringBuilder sb = new StringBuilder();
		// Finally we print all values what each keys have
		for(int i=0;i<n2;i++) sb.append(ans.get(arr2[i])+" ");
		System.out.print(sb);
	}

}
