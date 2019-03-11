package Composition;

import java.util.Scanner;

public class Home_Test {

	private static House house = new House();
	private static Rooms rooms = new Rooms();
	private static Scanner input = new Scanner(System.in);
	private static WC wc = new WC();
	private static Studyroom studyroom = new Studyroom();
	private static Kitchen kitchen = new Kitchen();
	private static Bathroom bathroom = new Bathroom();
	private static Bedroom bedroom = new Bedroom();
	private static LivingRoom livinRoom = new LivingRoom();
	
	
	public static void main(String[] args) {
		Home();

	}

	public static void Home() {
		int selection =1;
		System.out.println("Welcome");
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter key :");
			int key = input.nextInt();
			if (key == 1234) {
				house.enter(key);
				System.out.println();
				break;
			} else {
				System.out.println("Wrong key!");
				i++;
				if (i > 2) {
					System.out.println("Wrong Key ");
					System.out.println("\nYou are thief");
					System.out.println("Alarm rings");
					selection = -1;
				}
			}
		}
		while (selection >= 1) {
		
			System.out.println("Selections");
			System.out.println("1. Enter home");
			System.out.println("2. Exit Home");
			System.out.println("0. Exit Game");
			selection = input.nextInt();
			if (selection == 1) {
				house.enter();
				selection = 0;
				Rooms();
			} else if (selection == 2) {
				house.exit();
				break;
			} else if (selection == 0) {
				break;
			} else {
				System.out.println("Enter Wrong!");
			}
		}
	}

	public static void Rooms() {
		int selection =1;
		while (selection >= 1) {
			System.out.println("Selection");
			System.out.println("1. Exit Home");
			System.out.println("2. Enter Bathroom");
			System.out.println("3. Enter WC");
			System.out.println("4. Enter Studyroom");
			System.out.println("5. Enter Bedroom");
			System.out.println("6. Enter Kitchen");
			System.out.println("7. Enter Livingroom");
			System.out.println("8. Change key");
			System.out.println("0. Exit Game");
			selection = input.nextInt();
			if (selection == 1) {
				house.exit();
				break;
			} else if (selection == 2) {
				rooms = new Bathroom();
				rooms.enter();
				selection = 0;
				bathRoom();
			} else if (selection == 3) {
				rooms = new WC();
				rooms.enter();
				selection = 0;
				wc();
			} else if (selection == 4) {
				rooms = new Studyroom();
				rooms.enter();
				selection = 0;
				studyRoom();
			} else if (selection == 5) {
				rooms = new Bedroom();
				rooms.enter();
				selection = 0;
				bedRoom();
			} else if (selection == 6) {
				rooms = new Kitchen();
				rooms.enter();
				selection = 0;
				Kitchen();
			} else if (selection == 7) {
				rooms = new LivingRoom();
				rooms.enter();
				selection = 0;
				livingRoom();
			} else if (selection == 8) {
				System.out.println("4 haneli þifrenizi oluþturun.");
				int key = input.nextInt();
				house.setKey(key);
				System.out.println("New key is " + house.getKey());
			} else if (selection == 0) {
				System.out.println("Game Over.");
				break;
			} else {
				System.out.println("Enter Wrong!");
			}
		}
	}

	public static void wc() {
		int selection =1;
		while (selection >= 1) {

			System.out.println("1. BigWc");
			System.out.println("2. SmallWc");
			System.out.println("3. Hand Clear");
			System.out.println("4. Room Exit");
			System.out.println("0. Exit Game");

			selection = input.nextInt();

			if (selection == 1) {
				wc.big();
			} else if (selection == 2) {
				wc.small();
			} else if (selection == 3) {
				wc.handClear();
			} else if (selection == 4) {
				wc.exit();
				selection = 0;
				Rooms();
			} else if (selection == 0) {
				break;
			} else {
				System.out.println("Enter Wrong");
			}
		}
	}

	public static void studyRoom() {
		int selection =1;
		while (selection >= 1) {
			System.out.println("1. Work");
			System.out.println("2. Finish Work");
			System.out.println("3. Exit Room");
			System.out.println("0. Exit Game");
			selection = input.nextInt();
			if (selection == 1) {
				System.out.println("What do you work?");
				String workName = input.nextLine();
				studyroom.work(workName);
			} else if (selection == 2) {
				studyroom.finishWork();
			} else if (selection == 3) {
				studyroom.exit();
				selection = 0;
				Rooms();
			} else if (selection == 0) {
				break;
			} else {
				System.out.println("Enter Wrong!");
			}
		}
	}

	public static void Kitchen() {
		int selection =1;
		while (selection >= 1) {
			System.out.println("1. Wash Dish");
			System.out.println("2. Exit Room");
			System.out.println("0. Exit Game");
			selection = input.nextInt();
			if (selection == 1) {
				kitchen.washDish();
			} else if (selection == 2) {
				kitchen.exit();
				selection = 0;
				Rooms();
			} else if (selection == 0) {
				break;
			} else {
				System.out.println("Enter Wrong!");
			}
		}
	}

	public static void bathRoom() {
		int selection =1;
		while (selection >= 1) {
			System.out.println("1. To Shower");
			System.out.println("2. Exit Room");
			System.out.println("0. Exit Game");
			selection = input.nextInt();
			if (selection == 1) {
				bathroom.toShower();
			} else if (selection == 2) {
				bathroom.exit();
				selection = 0;
				Rooms();
			} else if (selection == 0) {
				break;
			} else {
				System.out.println("Enter Wrong!");
			}
		}
	}

	public static void bedRoom() {
		int selection =1;
		while (selection >= 1) {
			System.out.println("1. Sleep");
			System.out.println("2. Wake Up");
			System.out.println("3. Exit Room");
			System.out.println("0. Exit Game");
			selection = input.nextInt();
			if (selection == 1) {
				bedroom.sleep();
			} else if (selection == 2) {
				bedroom.wakeUp();
			} else if (selection == 3) {
				bedroom.exit();
				selection = 0;
				Rooms();
				break;
			} else if (selection == 0) {
				break;
			} else {
				System.out.println("Enter Wrong!");
			}
		}
	}

	public static void livingRoom() {
		int selection =1;
		while (selection >= 1) {
			System.out.println("1.Watch TV");
			System.out.println("2. Exit Room");
			System.out.println("0. Exit Game");
			selection = input.nextInt();
			if (selection == 1) {
				livinRoom.watchTV();
			} else if (selection == 2) {
				livinRoom.exit();
				selection = 0;
				Rooms();
			} else if (selection == 0) {
				break;
			} else {
				System.out.println("Enter Wrong!");
			}
		}
	}
}
