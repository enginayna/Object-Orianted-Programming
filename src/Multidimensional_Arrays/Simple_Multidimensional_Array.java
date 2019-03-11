package Multidimensional_Arrays;

public class Simple_Multidimensional_Array {
public static void main(String[] args) {
	int[][] array = new int[5][5];
	
	
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array.length; j++) {
			int number  = (int)(Math.random()*5);
			array[i][j] = number;
		}
	}
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[i][j] + " ");
			
		}
		System.out.println();
	}
}
}
