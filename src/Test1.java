
public class Test1 {
	public static void main(String[] args) {
		System.out.println("Hello, world!");
		
		int i = 3;
		float f = 3.1f;
		double d = 3.14;
		String s = "wanying fu";
		boolean b = true;
		
		int [] arrayInt = new int []{1, 2, 3, 4, 5};

		//print out with println function
		for (int k = 0;k < arrayInt.length;k++){
			System.out.println(arrayInt[k]);
		}
		
		//print out with print function
		for (int k = 0;k < arrayInt.length;k++ ){
			System.out.print(arrayInt[k]);
		}
		System.out.println();
		
		
		//
		int [] arrayNew = new int [] {11, 5323, 23, 12, 6, 3425, 345};
		printOut(arrayNew);
		
		sort(arrayNew);
		printOut(arrayNew);
		
		
		//
		printTable(9);
		
	}
	
	public static void sort(int [] array){
		int len = array.length;
		
		for(int i = 0;i < len;i++){
			for(int j = i + 1;j < len;j++){
				if (array[j] < array[i]){
					//swap the position
					int temp;
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
	public static void printOut(int [] array){
		int len = array.length;
		
		for(int i = 0;i < len;i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	
	public static void printTable(int num){
		for (int row = 0;row < num; row++){
			for (int column = 0; column < row;column++){
				int temp = row * column;
				System.out.print(row + "*" + column + "=" +  temp + "\t");
			}
			System.out.println();
		}
	}
	
}
