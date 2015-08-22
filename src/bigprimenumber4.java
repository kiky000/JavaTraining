import java.util.Scanner;

public class bigprimenumber4 {
	public static long largestPrimeFactor(long n) {
		final long factorMax = (long) Math.floor(Math.sqrt(n));
		for (long factor = factorMax; factor > 1; factor--) {
			if (n % factor == 0) {
				long leftMax = largestPrimeFactor(factor);
				long rightMax = largestPrimeFactor(n / factor);
				return Math.max(leftMax, rightMax);
			}
		}
		return n;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		long[] cases = new long[t];
		for (int i = 0; i < t; i++) {
			cases[i] = in.nextLong();
		}
		for (int i = 0; i < t; i++) {
			System.out.println(largestPrimeFactor(cases[i]));
		}
		in.close();
	}

}
