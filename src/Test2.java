public class Test2 {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] multiple1 = new int[array.length];
		for (int i = 1; i < array.length; i++) {
			multiple1[i] = 1 * array[i];
			System.out.print("1*" + array[i] + "=" + multiple1[i] + "\t");
		}
	}
}