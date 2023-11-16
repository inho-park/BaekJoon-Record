package math.combinatoric;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Second_1735 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken()), den1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int num2 = Integer.parseInt(st.nextToken()), den2 = Integer.parseInt(st.nextToken());

        int num = num1 * den2 + num2 * den1, den = den1 * den2, mod = gcd(num, den);
        num /= mod;
        den /= mod;

        bw.write(num + " " + den);
        bw.flush();
        bw.close();
        br.close();
    }

	static int gcd(int num, int den) { 
		if (num % den == 0) return den;
		return gcd(den, num % den);
	}

}
