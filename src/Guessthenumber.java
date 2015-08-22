import java.util.Random;
import java.util.Scanner;

public class Guessthenumber {
	public static void main(String[] args) {
		int[] a = new int[4];
		for (int i = 0; i < 4; i++) {
			Random rand = new Random();
			a[i] = rand.nextInt(10);
			for (int k = 0; k < i - 1; k++) {
				if (a[i] == a[k]) {
					Random rand2 = new Random();
					a[i] = rand2.nextInt(10);
					k = 0;
				}
			}
		}
		int ntry = 0;
		int c = 1000 * a[0] + 100 * a[1] + 10 * a[2] + a[3];
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] b = new int[4];
		while (ntry < 10 & n != c) {
			b[0] = n / 1000;
			b[1] = (n / 100) % 10;
			b[2] = (n / 10) % 100;
			b[3] = n % 10;
			int right = 0;
			int wrong = 0;
			for (int l = 0; l < 4; l++) {
				if (a[l] == b[l])
					right = right + 1;
				else {
					for (int p = 0; p < 4; p++) {
						if (b[l] == a[p])
							wrong = wrong + 1;
					}
				}
			}
			ntry = ntry + 1;
			System.out.println(right + "A" + wrong + "B");
			n = in.nextInt();
		}
		in.close();
		if (n == c)
			System.out.println("You win!");
		else
			System.out.println("You failed. The answer is " + c);
	}
}
