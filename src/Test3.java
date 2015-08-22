import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		for (int i = 1; i <= (n+1)/2; i++) {
			println(i, n);
		}
		
		for (int i = n/2; i >0; i--) {
			println(i, n);
		}
	}
	static void println(int i, int n)	{
		for (int j = 0; j < n - i; j++)
			System.out.print(" ");
		for (int k = 0; k < 2 * i - 1; k++)
			System.out.print("*");
		System.out.println();
		
	}
}
