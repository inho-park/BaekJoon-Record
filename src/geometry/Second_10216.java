package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Second_10216 {
	//
	static int[][] 배열;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int t=0; t<n; t++) {
            int m = Integer.parseInt(br.readLine());
            배열 = new int[m][3];
            for(int i=0; i<m; i++) {
                String[] str = br.readLine().split(" ");
                배열[i][0] = Integer.parseInt(str[0]);
                배열[i][1] = Integer.parseInt(str[1]);
                배열[i][2] = Integer.parseInt(str[2]);
            }
            visited = new boolean[m];
            int cnt = 0;
            for(int i=0; i<m; i++) {
                if(!visited[i]) {
                    counting(i);
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
 
    static void counting(int loc) {
        visited[loc] = true;
        for(int i=0; i<배열.length; i++) {
            if(!visited[i]) {
                double len = Math.pow(배열[loc][0]-배열[i][0], 2) 
                		+ Math.pow(배열[loc][1]-배열[i][1], 2);
                if(len <= Math.pow((배열[loc][2] + 배열[i][2]), 2))
                    counting(i);
            }
        }
    }
}