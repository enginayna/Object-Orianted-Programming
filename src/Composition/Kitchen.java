package Composition;

public class Kitchen extends Rooms {

	public Kitchen() {

	}

	@Override
	public void enter() {
		System.out.println("You are in Kitchen");
	}

	public void washDish() {
		System.out.println("You did wash dish");
	}

	@Override
	public void exit() {
		System.out.println("You exit from Kitchen");
	}

}
