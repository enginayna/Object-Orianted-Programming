package StaticKeyword;

import java.util.Scanner;

public class StaticResult {
	static Scanner input = new Scanner(System.in);
		public static void main(String[] args) {
				/*System.out.println("Sayý girin : ");
				StaticVeriables.number1 = input.nextInt();
				System.out.println("Sayý girin : ");
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
			 * Static metotlar yada deðiþkenler ancak static metotlar içinde çaðýrýlabilir.
			 * Static metot yada deðiþkenler sýnýf ismi ile çaðýrabilir. fakat diðer deðiþken yada metotlar
			 * ancak nesne yaratýlarak çaðýrýlýr.
			 */
		}
		
}
