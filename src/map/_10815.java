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
		//첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 
		//둘째 줄에는 숫자 카드에 적혀있는 정수가 주어진다. 숫자 카드에 적혀있는 수는 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다. 
		//두 숫자 카드에 같은 수가 적혀있는 경우는 없다.
		//셋째 줄에는 M(1 ≤ M ≤ 500,000)이 주어진다. 
		//넷째 줄에는 상근이가 가지고 있는 숫자 카드인지 아닌지를 구해야 할 M개의 정수가 주어지며, 이 수는 공백으로 구분되어져 있다. 
		//이 수도 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다
		
		//Output
		//첫째 줄에 입력으로 주어진 M개의 수에 대해서, 각 수가 적힌 숫자 카드를 상근이가 가지고 있으면 1을, 아니면 0을 공백으로 구분해 출력한다.
		
		
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
