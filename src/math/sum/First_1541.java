package math.sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_1541 {
	// 입력
	//	첫째 줄에 식이 주어진다. 식은 ‘0’~‘9’, ‘+’, 그리고 ‘-’만으로 이루어져 있고, 가장 처음과 마지막 문자는 숫자이다. 
	//	그리고 연속해서 두 개 이상의 연산자가 나타나지 않고, 5자리보다 많이 연속되는 숫자는 없다. 수는 0으로 시작할 수 있다. 
	//	입력으로 주어지는 식의 길이는 50보다 작거나 같다.
	// 출력
	//	첫째 줄에 괄호를 적절히 쳐서 값을 최소로 만들었을 때, 정답을 출력한다.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer sub = new StringTokenizer(br.readLine(), "-");
		int result = 4999950;
		while(sub.hasMoreTokens()) {
			int temp = 0;
			StringTokenizer add = new StringTokenizer(sub.nextToken(), "+");
			while(add.hasMoreTokens()) {
				temp += Integer.parseInt(add.nextToken());
			}
			if (result == 4999950) {
				result = temp;
			} else {
				result -= temp;
			}
		}
		
		System.out.print(result);
	}
}