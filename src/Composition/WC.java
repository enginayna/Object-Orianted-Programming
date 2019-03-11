package Composition;

public class WC extends Rooms {

	public WC() {

	}

	public WC(Kitchen kitchen, Bathroom bathroom, Bedroom bedroom, WC wc, Studyroom studyroom,
			LivingRoom livingRoom) {
		super(kitchen, bathroom, bedroom, wc, studyroom, livingRoom);
	}

	@Override
	public void enter() {
		System.out.println("You are in WC");
	}

	public void big() {
		System.out.println("Büyük abdest:D");
	}

	public void small() {
		System.out.println("You pissed");
	}

	public void handClear() {
		System.out.println("You clear hands ");
	}

	@Override
	public void exit() {
		System.out.println("You exit from WC");
	}

}
