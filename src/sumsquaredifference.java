import java.util.Scanner;


public class sumsquaredifference {
	static long sumofsquare(long n){
		return n*(n+1)*(2*n+1)/6;		
	}
	static long squareofsum(long n){
		return n*n*(1+n)*(1+n)/4;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int[] sample = new int[number];
		for (int j = 0; j < number; j++) {
			sample[j] = in.nextInt();
		}
		for (int j = 0; j < number; j++) {
			System.out.println(squareofsum(sample[j])-sumofsquare(sample[j]));
		}
	}
}
