package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class First_1707 {
	// 입력
	//	입력은 여러 개의 테스트 케이스로 구성되어 있는데, 첫째 줄에 테스트 케이스의 개수 K가 주어진다. 
	//	각 테스트 케이스의 첫째 줄에는 그래프의 정점의 개수 V와 간선의 개수 E가 빈 칸을 사이에 두고 순서대로 주어진다. 
	//	각 정점에는 1부터 V까지 차례로 번호가 붙어 있다. 이어서 둘째 줄부터 E개의 줄에 걸쳐 간선에 대한 정보가 주어지는데, 
	//	각 줄에 인접한 두 정점의 번호 u, v (u ≠ v)가 빈 칸을 사이에 두고 주어진다. 
	// 출력
	//	K개의 줄에 걸쳐 입력으로 주어진 그래프가 이분 그래프이면 YES, 아니면 NO를 순서대로 출력한다.
	
	static int k, V, e, check [];
	static List<List<Integer>> graph;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		k = Integer.parseInt(br.readLine());
		for (int i = 0; i < k; i++) {
			graph = new ArrayList<>();
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			V = Integer.parseInt(st.nextToken());
			e = Integer.parseInt(st.nextToken());
			check = new int [V + 1];
			for (int j = 0; j <= V; j++) {
				graph.add(new ArrayList<>());
			}
			for (int j = 0; j < e; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				int from = Integer.parseInt(st.nextToken());
				int to = Integer.parseInt(st.nextToken());
				
				graph.get(from).add(to);
				graph.get(to).add(from);
			}
			boolean result = false;
			for(int j = 1; j <= V; j++) {
				if (check[j] == 0) {
					result = bfs(j, 1);
				}
				if (!result) break;
			}
			System.out.println(result ? "YES" : "NO");
		}

	}

	private static boolean bfs(int from, int color) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(from);
		check[from] = color;
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			for (int i = 0; i < graph.get(temp).size(); i++) {
				int next = graph.get(temp).get(i);
				if (check[temp] == check[next]) return false;
				if (check[next] == 0) {
					check[next] = check[temp] * -1;
					queue.offer(next);
				}
			}
		}
		return true;
	}
}