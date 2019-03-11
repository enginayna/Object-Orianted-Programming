package RandomClass;

import java.util.Random;

public class RandomClass {
public static void main(String[] args) {
	Random number = new Random(3);
	for (int i = 0; i < 10; i++) {
	System.out.print(	number.nextInt(1000) + " ");
	}
	System.out.println();
	Random number1 = new Random(3);
	for (int i = 0; i < 10; i++) {
		System.out.print(number1.nextInt(1000) + " ");
	}
	System.out.println();
	Random num = new Random();
	for (int i = 0; i < 10; i++) {
		System.out.print(num.nextInt(50) + " ");
	}
	
}
}
