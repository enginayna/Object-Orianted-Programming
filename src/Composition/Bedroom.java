package Composition;

public class Bedroom extends Rooms {

	public Bedroom() {

	}

	public Bedroom(Kitchen kitchen, Bathroom bathroom, Bedroom bedroom, WC wc, Studyroom studyroom, 
			LivingRoom livingRoom) {
		super(kitchen, bathroom, bedroom, wc, studyroom, livingRoom);
	}

	@Override
	public void enter() {
		System.out.println("You are in Bedroom");

	}

	public void sleep() {
		System.out.println("You was sleep");
	}

	public void wakeUp() {
		System.out.println("You was wake up");
	}

	@Override
	public void exit() {
		System.out.println("You exit forum bedroom");
	}

}
