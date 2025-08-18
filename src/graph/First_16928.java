package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class First_16928 {
	// 입력
	//	첫째 줄에 게임판에 있는 사다리의 수 N(1 ≤ N ≤ 15)과 뱀의 수 M(1 ≤ M ≤ 15)이 주어진다.
	//	둘째 줄부터 N개의 줄에는 사다리의 정보를 의미하는 x, y (x < y)가 주어진다. x번 칸에 도착하면, y번 칸으로 이동한다는 의미이다.
	//	다음 M개의 줄에는 뱀의 정보를 의미하는 u, v (u > v)가 주어진다. u번 칸에 도착하면, v번 칸으로 이동한다는 의미이다.
	//	1번 칸과 100번 칸은 뱀과 사다리의 시작 또는 끝이 아니다. 모든 칸은 최대 하나의 사다리 또는 뱀을 가지고 있으며, 
	//	동시에 두 가지를 모두 가지고 있는 경우는 없다. 항상 100번 칸에 도착할 수 있는 입력만 주어진다.
	// 출력
	//	100번 칸에 도착하기 위해 주사위를 최소 몇 번 굴려야 하는지 출력한다.
	static int arr [] = new int [101];
	static Map<Integer, Integer> portal = new HashMap<>();
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	portal.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        
        bfs();
    }
    
    static void bfs() {
    	int cnt = 0;
    	int loc = 1;
    	arr[loc] = cnt;
    	Queue<Integer> queue = new LinkedList<>();
    	queue.offer(loc);
    	while(!queue.isEmpty()) {
    		loc = queue.poll();
    		for (int i = 1; i <= 6; i++) {
    			int next = loc + i;
    			if (next == 100) {
    				System.out.print(arr[loc] + 1);
    				return;
    			}
    			next = portal.containsKey(next) ? portal.get(next) : next;
    			if (arr[next] == 0) {
    				arr[next] = arr[loc] + 1;
    				queue.offer(next);
    			} else continue;
    		}
    	}
    }
}
