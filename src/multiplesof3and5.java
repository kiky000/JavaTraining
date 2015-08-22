import java.util.Scanner;


public class multiplesof3and5 {
	static long multiplesof3(long n){
		long length=n/3;
		return 3*(1+length)*length/2;
	}
	static long multiplesof5(long n){
		long length=n/5;
		return 5*(1+length)*length/2;
	}
	static long multiplesof15(long n){
		long length=n/15;
		return 15*(1+length)*length/2;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		long[] input = new long[n];
		for(int i=0; i<n; i++) {
			input[i] = in.nextInt();
		}
		in.close();
		for(int i=0; i<n; i++){
		System.out.println(multiplesof3(input[i]-1)+multiplesof5(input[i]-1)-multiplesof15(input[i]-1));
		}
	} 
}
