package Composition;

public class House extends Rooms {

	private Rooms room;

	private int key;

	public House() {

	}
	

	
	


	public House(Rooms room, int key) {

		this.room = room;
		this.key = key;
	}

	public void enter(int key) {
		if (key == 1234) {
			System.out.println("You in home");
		} 
	}

	public void exit() {

		System.out.println("You are exit from Home.");
	}

	public Rooms getRoom() {
		return room;
	}

	public void setRoom(Rooms room) {
		this.room = room;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

}
