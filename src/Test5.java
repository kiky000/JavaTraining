import java.util.Scanner;

public class Test5 {
	static void printplus(String prefix, int n, int m) {
		if (n == 0) {
			System.out.println(prefix + "=" + m);
		} else {
			for (int i = 1; i <= n; i++) {
				printplus(((prefix.equals("")) ? "" : prefix + "+") + i, n - i,
						m);
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		in.close();
		printplus("", m, m);
	}
}

// 1=1
// 1+1=2
// 1+1+1=3
// 1+2=3
// 2+1=3
// 3=3
// 1+1+1+1=4
// 1+1+2=4
// 1+2+1=4
// 1+3=4
// 2+1+1=4
// 2+2=4
// 3+1=4
// 4=4