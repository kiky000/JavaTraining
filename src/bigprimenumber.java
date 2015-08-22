import java.util.Scanner;

public class bigprimenumber {
	static long p = 1;

	static long primefactor(long n) {
		int index = 0;
		while (n % 2 == 0) {
			n = n / 2;
			index = 1;
		}
		long i = n / 2;
		while (n % (2 * i - 1) != 0) {
			i--;
		}
		if (i == 1 && (n % 2 != 0)) {
			if (index == 1) {
				return (n > 2) ? n : 2;
			} else {
				return n;
			}
		} else {
			p = 2 * i - 1;
			if((p%(n/p)==0)||((n/p)/p==0)){
				if(p>=(n/p)){
					return primefactor(p);
				}else
				{
					return primefactor(n/p);
				}
			}else{
				
				long p1 = primefactor(p);
				long p2 = primefactor(n / p);
				if (p1 >= p2) {
					if (index == 1) {
						return (p1 > 2) ? p1 : 2;
					} else {
						return p1;
					}
				} else {
					if (index == 1) {
						return (p2 > 2) ? p2 : 2;
					} else {
						return p2;
					}
				}
			}
		}

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		long[] sample = new long[number];
		for (int j = 0; j < number; j++) {
			sample[j] = in.nextLong();
		}
		for (int q = 0; q < number; q++) {
			System.out.println(primefactor(sample[q]));
		}
	}
}
