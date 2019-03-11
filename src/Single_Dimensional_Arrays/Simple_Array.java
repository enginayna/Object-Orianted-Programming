package Single_Dimensional_Arrays;

public class Simple_Array {
public static void main(String[] args) {
	String array[] = new String[5];
	array[1] = "Engin";
	array[2] = "Zeynep";
	array[3] = "Ahmet";
	array[4] = "Gamze";
	array[0] = "Sevgi";
	for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);
	}
}
}
