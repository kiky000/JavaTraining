public class maxgain {
	static int maxgain(int[] value, int[] weight, int capacity, int index) {
		if (capacity < 0 || index < 0)
			return 0;
		else {
			int notincluded = maxgain(value, weight, capacity, index - 1);
			int included = ((capacity - weight[index])>=0)?(maxgain(value, weight, capacity - weight[index],
					index - 1)+value[index]):0;
			if (notincluded < included) {
				return included;
			} else {
				return notincluded;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(maxgain(new int[] { 3,4,1,5 }, new int[] { 2, 3,
				1, 5 }, 6, 3));
	}
}
