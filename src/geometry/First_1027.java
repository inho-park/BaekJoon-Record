package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class First_1027 {
	// ���� ���� ������ �Է������� ��� ���� 7�� �ȳ����� 6�� ���ͼ� �Ӹ��� ���ʹµ� �˰��� 
	// double ĳ������ �������� �׷��ϱ� ũ�Ⱑ �ٸ� ���� 2���� int ������ ����� �Ǿ� double Ÿ�Կ� �ʱ�ȭ�Ǳ� ������
	// Ex) 8/3 => 2.0 , 7/3 => 2.0
	// ���� ����ó�� diff �� nextDiff �� �ʱ�ȭ�Ǿ� ���Ⱑ �ٸ����� ���� ���Ǵ� ������ �־���
	// 15
	// 1 5 3 2 6 3 2 6 4 2 5 7 3 1 5
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int arr [] = new int [n];
        int cnt [] = new int [n];
        for (int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=0;i<n-1;i++){
            double diff = arr[i+1] - arr[i];
            cnt[i]++;
            cnt[i+1]++;
            for (int j=i+2;j<n;j++){
                double nextDiff = (double)(arr[j] - arr[i])/(j-i); // double ĳ���� �߿�
                if (nextDiff > diff){
                    diff = nextDiff;
                    cnt[i]++; cnt[j]++;
                }
            }
        }

        Arrays.sort(cnt);
        System.out.print(cnt[n-1]);
    }
}
