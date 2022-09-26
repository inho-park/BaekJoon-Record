package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_9015 {
	static int ans;
    static boolean map [][] = new boolean[20001][20001];
    static int loc [][];
    public static void main(String[] args) throws IOException {
        int x1,y1,x2,y2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i=0;i<n;i++) {
            int m = Integer.parseInt(br.readLine());
            ans=0;
            loc = new int [m][2];
            for (int j=0;j<m;j++) {
                String num [] = br.readLine().split(" ");
                loc[j][0] = Integer.parseInt(num[0]);
                loc[j][1] = Integer.parseInt(num[1]);
                map[loc[j][0]+10000][loc[j][1]+10000] = true;
            }
            for (int j=0;j<m;j++) {
                for (int k=0;k<m;k++) {
                    if (k==j) continue;
                    x1 = loc[j][0];
                    y1 = loc[j][1];
                    x2 = loc[k][0];
                    y2 = loc[k][1];
                    if (ans >= Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2)) continue;
                    int x_diff = x1-x2, y_diff = y1-y2;
                    if (((x1-y_diff+10000)<20001 && (x1-y_diff+10000)>0) && ((y1+x_diff+10000)<20001 &&
                            (y1+x_diff+10000)>0)){
                        if (map[x1-y_diff+10000][y1+x_diff+10000]
                                && map[x2-y_diff+10000][y2+x_diff+10000]){
                            ans = Math.max(ans,(int)(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2)));
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
}