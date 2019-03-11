package Composition;

public class LivingRoom extends Rooms {

	public LivingRoom() {

	}

	public LivingRoom(Kitchen kitchen, Bathroom bathroom, Bedroom bedroom, WC wc, Studyroom studyroom,
			LivingRoom livingRoom) {
		super(kitchen, bathroom, bedroom, wc, studyroom, livingRoom);
	}

	@Override
	public void enter() {
		System.out.println("You are in Livingroom");
	}

	public void watchTV() {
		System.out.println("You did watch TV");
	}

	@Override
	public void exit() {
		System.out.println("You exit from livingroom");
	}

}