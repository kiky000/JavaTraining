import java.util.ArrayList;
import java.util.Scanner;


public class Evensumfibonacci {
	static void fibonacci(long n){
		ArrayList<Long> result=new ArrayList<Long>();
		result.add(1l);
		result.add(2l);
		long m=result.get(0)+result.get(1);
		long sum=2l;
		int i=1;
		while(m<=n){
			result.add(m);
			i++;
			if(m%2==0){
				sum+=m;
			}
			m=result.get(i)+result.get(i-1);
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		long[] input=  new long[n];
		for(int j=0;j<n;j++){
			input[j]=in.nextLong();
		}
		for(int j=0;j<n;j++){
			fibonacci(input[j]);
		}		
	}
	
}
