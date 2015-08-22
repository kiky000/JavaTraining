
public class gcd {
static int findgcd(int i1,int i2){
	if(i1%i2==0)
		return i2;
	else{
		return findgcd(i2,i1%i2);
	}
}
public static void main(String[] args) {
	System.out.println(findgcd(11005,2015));
}
}
