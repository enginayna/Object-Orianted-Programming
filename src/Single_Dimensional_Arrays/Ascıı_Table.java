package Single_Dimensional_Arrays;

public class Ascýý_Table {
public static void main(String[] args) {
	char[] array = new char[26];
	for (int i = 0 ; i < array.length; i++) {
		array[i] =(char)(97 + i);
	}
	for (int i = 0; i < array.length; i++) {
		System.out.printf("%3c" , array[i]);
		if((i+1) % 5 ==0) {
			System.out.println();
		}
	}
	
}
}
