import java.util.ArrayList;
import java.util.Scanner;

public class bigprimenumber2 {
	static long bignumber(long[] array) {
		int index = array.length;
		long m = 0l;
		for (int i = 0; i < index; i++) {
			if (m < array[i]) {
				m = array[i];
			}
		}
		return m;
	}
	static int checkprime(long x){
		if(x==2){
			return 1;
		}else{
			if(x%2==0){
				return 0;
			}else{
				long i=x/2;
				while(x%(2*i-1)!=0){
					i--;
				}
				if(i==1){
					return 1;
				}else{
					return 0;
				}
			}
		}
	}
	static ArrayList<Long> primeseries(long n){
		int j=0;
		ArrayList<Long> series=new ArrayList<Long>();
		if(checkprime(n)==1){
			series.add(n);
			j++;
		}
		for(long i=n/2;i>=2;i--){
			if(checkprime(2*i-1)==1){
				series.add(2*i-1);
				j++;
			}
		}
		series.add(2l);
		return series;
	}
	static void primefactor(long n,ArrayList<Long> series){
		int i=0;
		while(n<series.get(i)){
			i++;
		}
		while(n%series.get(i)!=0){
			i++;
		}
		System.out.println(series.get(i));
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		long[] sample = new long[number];
		for (int j = 0; j < number; j++) {
			sample[j] = in.nextLong();
		}
		long n=bignumber(sample);
		ArrayList<Long> series=primeseries(n);
		for (int j = 0; j < number; j++) {
			primefactor(sample[j],series);
		}
	}
}
