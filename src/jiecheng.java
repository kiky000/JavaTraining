
public class jiecheng {
static int jiecheng(int n){
	if(n==0)
		return 1;
	else{
		return n*jiecheng(n-1);
	}
}
public static void main(String[] args) {
	System.out.println(jiecheng(10));
}
}
