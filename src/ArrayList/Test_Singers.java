package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Test_Singers {

	private static Singers singers = new Singers();
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("\t---Welcome to Singers Application---\n");
		printSelection();
		selection();
	}
	
	public static void printSelection() {
		System.out.println("1. Show selection ");
		System.out.println("2. Show Singer List ");
		System.out.println("3. Add Singer");
		System.out.println("4. Change Singer");
		System.out.println("5. Delete Singer ");
		System.out.println("6. Search Singer");
		System.out.println("0. Application Exit");
	}
	
	public static void selection() {
		
		int selection = 1;
		
		while(selection > 0) {
			System.out.println("Operation selection : ");
			selection = input.nextInt();
			input.nextLine();
			switch (selection) {
			case 0: selection = 0; System.out.println("Good bye..."); ;break;
			case 1: printSelection(); break;
			case 2: displaySingerList(); break;
			case 3: addSinger(); break;
			case 4: changeSinger(); break;
			case 5: deleteSinger(); break;
			case 6: searchSinger(); break;
			default:
				break;
			}
		}
	}

	public static void displaySingerList() {
		singers.printSingerList();
	}
	
	public static void addSinger() {
		System.out.println("Enter singer name : ");
		String name = input.nextLine();
		
		singers.addSinger(name);
	}
	
	public static void changeSinger() {
		System.out.println("The order of the singer to be changed : ");
		int index = input.nextInt();
		input.nextLine();
		System.out.println("Enter new singer name : ");
		String name = input.nextLine();
		
		singers.changeSinger(index, name);
	}
	
	public static void deleteSinger() {
		System.out.println("The order of the singer to be deleted : ");
		int index = input.nextInt();
		
		singers.deleteSinger(index);
	}
	
	public static void searchSinger() {
		System.out.println("Search singer name : ");
		String name = input.nextLine();
		
		singers.searchSinger(name);
	}
	
}
