package StaticKeyword;

import java.util.Scanner;

public class StaticResult {
	static Scanner input = new Scanner(System.in);
		public static void main(String[] args) {
				/*System.out.println("Say� girin : ");
				StaticVeriables.number1 = input.nextInt();
				System.out.println("Say� girin : ");
				StaticVeriables.number2 = input.nextInt();
				System.out.println("Result : " + StaticVeriables.addition());
				*/
				StaticVeriables divide = new StaticVeriables();
			
			System.out.printf("%4.2f" , divide.division(789, 56) );	
			
			StaticVeriables.number1 = 44;
			StaticVeriables.number2 = 48;
			System.out.println("\n" + StaticVeriables.addition());
			StaticVeriables.number1 = 2;
			System.out.println(StaticVeriables.addition());
			
		
			/*
			 * Static metotlar yada de�i�kenler ancak static metotlar i�inde �a��r�labilir.
			 * Static metot yada de�i�kenler s�n�f ismi ile �a��rabilir. fakat di�er de�i�ken yada metotlar
			 * ancak nesne yarat�larak �a��r�l�r.
			 */
		}
		
}
