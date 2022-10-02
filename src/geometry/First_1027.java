package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class First_1027 {
	// 위와 같은 예제를 입력했으나 계속 답이 7이 안나오고 6이 나와서 머리가 아팠는데 알고보니 
	// double 캐스팅의 문제였다 그러니까 크기가 다른 기울기 2개가 int 형으로 계산이 되어 double 타입에 초기화되기 때문에
	// Ex) 8/3 => 2.0 , 7/3 => 2.0
	// 위의 예시처럼 diff 와 nextDiff 가 초기화되어 기울기가 다르지만 같게 계산되는 문제가 있었다
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
                double nextDiff = (double)(arr[j] - arr[i])/(j-i); // double 캐스팅 중요
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
