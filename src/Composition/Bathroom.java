package Composition;

public class Bathroom extends Rooms {

	public Bathroom() {

	}

	public Bathroom(Kitchen kitchen, Bathroom bathroom, Bedroom bedroom, WC wc, Studyroom studyroom,
			 LivingRoom livingRoom) {
		super(kitchen, bathroom, bedroom, wc, studyroom, livingRoom);
	}

	@Override
	public void enter() {
		System.out.println("You are in Bathroom");
	}

	public void toShower() {
		System.out.println("You did to shower");
	}

	@Override
	public void exit() {
		System.out.println("You exit from Bathroom");
	}

}
