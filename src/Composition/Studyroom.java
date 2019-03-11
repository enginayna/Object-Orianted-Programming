package Composition;

public class Studyroom extends Rooms {

	private String workName;

	public Studyroom() {

	}

	public Studyroom(Kitchen kitchen, Bathroom bathroom, Bedroom bedroom, WC wc, Studyroom studyroom,
		 LivingRoom livingRoom) {
		super(kitchen, bathroom, bedroom, wc, studyroom, livingRoom);
	}

	@Override
	public void enter() {

		System.out.println("You are in Studyroom");
	}

	public void work(String workName) {
		System.out.println("You works " + workName);
	}

	public void finishWork() {

		System.out.println("You don't working");
	}

	@Override
	public void exit() {
		System.out.println("You exit from studyroom");
	}

	public String getWorkName() {
		return workName;
	}

	public void setWorkName(String workName) {
		this.workName = workName;
	}

}
