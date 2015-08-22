import org.omg.Messaging.SyncScopeHelper;

public class fib {
	static int fib(int n1, int n2, int index) {
		if (index == 1)
			return n1;
		else {
			if (index == 2)
				return n2;
			else
				return fib(n1, n2, index - 2) + fib(n1, n2, index - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(fib(1, 2, 4));
	}

}
