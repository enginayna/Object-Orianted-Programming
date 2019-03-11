package Arrays;

import java.util.Arrays;

public class Simple_Arrays {
public static void main(String[] args) {
	int [] a =  new int[10];
	
	/*for (int i = 0; i < a.length; i++ ) {
		a[i] = i*10;
		System.out.println(a[i]);
	}*/
	
	int[] b = new int[10];
	for (int i = 0; i < b.length; i++) {
		int z = (int)(Math.random()*50);
		b[i] = z;
		System.out.print(b[i] + " ");
	}
	System.out.println();
	int temp;
	/*for (int i = 0; i < b.length; i++) {
		for (int j = 0; j < b.length; j++) {
			if(b[i] < b[j]) {
				temp = b[i];
				b[i] = b[j]; 
				b[j] = temp; 
			}
		}
	}*/
//	Arrays.parallelSort(b);  bu metot ile de ayný iþlemi yapýyor.
	Arrays.sort(b); // bu metot Arrays.parallelSort ile ayný iþlemi yapýyor.
	for (int i = 0; i < b.length; i++) {
		System.out.print(b[i] + " ");
	}
}
}
