package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_4721 {
	// ������ ���������� �� ���Ϳ� ���� ���� �� ����纯���� ���̸� ���� �� ���͸� ��Į��� �ٲٱ� ���� ������ �ط� ����
	// ���� Ư���� int �� ������ �Ѿ ��찡 �ִµ� �������� ���ϰ� �����ϴٰ� long �� ����ؾ��Ѵٴ� ���� ������
	// �˰����� ���ۿ� �˾����� int �� ����ϸ� �ȵȴٴ� ���� �ʰ� �˾ұ⿡ �׳� First �� ������
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
