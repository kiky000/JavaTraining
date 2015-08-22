public class sum {
	static int product(int index) {
		if (index == 1)
			return 1;
		else {
			return product(index - 1) * index;
		}
	}

	public static void main(String[] args) {
		System.out.println(product(20));
	}

}
