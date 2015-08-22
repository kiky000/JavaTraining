import java.util.ArrayList;
import java.util.Scanner;


public class bigprimenumber3 {
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

	public static ArrayList<Long> primeseries(Long x) {
		ArrayList<Long> result = new ArrayList<Long>();
		result.add(2l);
		long base = 3;
		while (base <= x) {
			long iterateMax = (long) Math.floor(Math.sqrt(base));
			boolean isPrime = true;
			for(Long prime : result) {
				if(prime > iterateMax)
					break;
				if(base % prime == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				result.add(base);
			base += 2;
		}
		return result;
	}


	static void primefactor(long n,ArrayList<Long> series){
		int i=series.size()-1;
		while(n<series.get(i)){
			i--;
		}
		while(n%series.get(i)!=0){
			i--;
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
