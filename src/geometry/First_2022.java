package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_2022 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str [] = br.readLine().split(" ");
        double x = Double.parseDouble(str[0]);
        double y = Double.parseDouble(str[1]);
        double c = Double.parseDouble(str[2]);

        double left = 0, right = Math.min(x,y);

        while(right - left >=0.001) {
            double w = (left + right) / 2;
            double h1 = Math.sqrt(Math.pow(x,2) - Math.pow(w,2));
            double h2 = Math.sqrt(Math.pow(y,2) - Math.pow(w,2));
            double res = (h1 * h2) / (h1 + h2);
//            System.out.println("left : "+left+"\tright : "+right);
            if (res >= c) left = w;
            else right = w;
        }
        System.out.print(right);
	}
}
