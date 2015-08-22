import java.util.ArrayList;
import java.util.Scanner;

public class listofprimenumber {
	static ArrayList<Long> primelist(int n) {
		ArrayList<Long> series = new ArrayList<Long>();
		series.add(2l);
		long base = 3l;
		int i = 1;
		while (i < n) {
			boolean isprime = true;
			for (Long prime : series) {
				if (prime > base) {
					break;
				} else {
					if (base % prime == 0) {
						isprime = false;
						break;
					}
				}
			}
			if (isprime) {
				series.add(base);
				i++;
			}
			base += 2;
		}
		return series;
	}

	static int maxno(int[] sample) {
		int p = 0;
		for (int i = 0; i < sample.length; i++) {
			if (p < sample[i]) {
				p = sample[i];
			}
		}
		return p;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int[] sample = new int[number];
		for (int j = 0; j < number; j++) {
			sample[j] = in.nextInt();
		}
		ArrayList<Long> primelist = primelist(maxno(sample));
		for (int j = 0; j < number; j++) {
			System.out.println(primelist.get(sample[j]-1));
		}
	}
}
