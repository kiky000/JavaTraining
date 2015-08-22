public class Test4 {
	public static void main(String[] args) {
		int[] column = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] row = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[][] multiple = new int[column.length][row.length];
		for (int i = 0; i < row.length; i++) {
			for (int j = 0; j <= i; j++) {
				multiple[i][j] = row[i] * column[j];
				System.out.print(row[i] + "*" + column[j] + "="
						+ multiple[i][j] + "\t");
							}
			System.out.println();
		}
	}
}
