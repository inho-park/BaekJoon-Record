package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_4721 {
	// 벡터의 외적을통해 두 벡터에 대한 외적 즉 평행사변형의 넓이를 구한 후 벡터를 스칼라로 바꾸기 위해 절댓값을 해로 구함
	// 수의 특성상 int 의 범위를 넘어갈 경우가 있는데 생각하지 못하고 삽질하다가 long 을 사용해야한다는 것을 깨달음
	// 알고리즘은 진작에 알았지만 int 를 사용하면 안된다는 점을 늦게 알았기에 그냥 First 로 지정함
	static long loc [][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        loc = new long [n+1][2];
        for (int i=0;i<n;i++){
            String str []= br.readLine().split(" ");
            loc[i][0] = Long.parseLong(str[0]);
            loc[i][1] = Long.parseLong(str[1]);
        }
        loc[n][0] = loc[0][0];
        loc[n][1] = loc[0][1];
        long ans1=0, ans2=0;
        for (int i=0;i<n;i++){
            ans1+=loc[i][0]*loc[i+1][1];
            ans2+=loc[i][1]*loc[i+1][0];
            System.out.println(ans1+"\t"+ans2);
        }
        double ans = Math.abs((ans1-ans2)/2.0);
        System.out.print(String.format("%.1f", ans));
    }

}
