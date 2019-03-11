package AbstractClass;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		GeometricObject object;
		String operation = "-----OPERATÝONS------\n" + "1.Triangle Calculate Area\n" + "2.Sguare Calculate Area\n"
				+ "3.Circle Calculate Area\n" + "0. Exit";
		int selection;
		while (true) {

			System.out.println(operation);
			System.out.println("\nSelection : ");
			selection = input.nextInt();

			if (selection == 1) {

				System.out.println("Enter side length : ");
				int side1 = input.nextInt();
				input.nextLine();

				System.out.println("Enter side(2) length : ");
				int side2 = input.nextInt();

				System.out.println("Enter side(3) length : ");
				int side3 = input.nextInt();

				object = new Triangle("Triangle ", side1, side2, side3);
				object.calculateArea();
			} else if (selection == 2) {

				System.out.println("Enter side length : ");
				double side = input.nextDouble();

				object = new Square("Square ", side);
				object.calculateArea();
			} else if (selection == 3) {

				System.out.println("Enter radius : ");
				double radius = input.nextDouble();

				object = new Circle("Circle ", radius);
				object.calculateArea();
			} else if (selection == 0) {

				System.out.println("Good By :D");
				break;
			} else {
				System.out.println("You wrong entered. Please try again\n\n");
			}

		}

	}
}
