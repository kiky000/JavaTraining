import java.util.Scanner;


public class largestpalindrome {
	static boolean checklargestpalindrome(int n){
		int a=n%10;
		int b=(n/10)%10;
		int c=(n/100)%10;
		int d=(n/1000)%10;
		int e=(n/10000)%10;
		int f=n/100000;
		if(a==f&&e==b&&d==c){
			return true;
		}else
			return false;
	}
	static void bigpalindrome(int n){
		int product=0;
		int value=101101;
		for(int i=999;i>100;i--){			
			for(int j=i;j>100;j--){
				product=i*j;
				if(product<n&&product>=100000){
					if(checklargestpalindrome(product)==true){					
						if(product>value){
							value=product;
						}
					}
				}
			}
			if(product<n&&product>=100000&&checklargestpalindrome(product)==true){
				if(product>value){
					value=product;
				}
			}
		}
		System.out.println(value);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int[] sample = new int[number];
		for (int j = 0; j < number; j++) {
			sample[j] = in.nextInt();
		}
		for (int j = 0; j < number; j++) {
			bigpalindrome(sample[j]);
		}
	}
}
