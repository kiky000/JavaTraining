import java.util.ArrayList;
import java.util.Scanner;

public class smallestmultiple {

	static int maxcommonfactor(int i,int j){
		if(j==0){
			return i;
		}else{
			return maxcommonfactor(j,i%j);
		}
		
	}
	static int mincommonproduct(int i,int j){
		return i*j/maxcommonfactor(i,j);
	}
	static int commonproduct(int n){
		if(n==1){
			return 1;
		}else{
			return mincommonproduct(n,commonproduct(n-1));
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int[] sample = new int[number];
		for (int j = 0; j < number; j++) {
			sample[j] = in.nextInt();
		}
		for (int j = 0; j < number; j++) {
			System.out.println(commonproduct(sample[j]));
		}
	}
}
