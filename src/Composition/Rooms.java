package Composition;

public class Rooms {

	private Kitchen kitchen;
	
	private Bathroom bathroom;
	
	private Bedroom bedroom;
	
	private WC wc;
	
	private Studyroom studyroom;
	
	private LivingRoom livingRoom;
	


	public Rooms(){
		
	}

	public Rooms(Kitchen kitchen, Bathroom bathroom, Bedroom bedroom, WC wc, Studyroom studyroom, 
			LivingRoom livingRoom) {	
		this.kitchen = kitchen;
		this.bathroom = bathroom;
		this.bedroom = bedroom;
		this.wc = wc;
		this.studyroom = studyroom;
		this.livingRoom = livingRoom;
	}
	
	public void enter() {
	
	}
	
	public void exit() {
		
	}

	public Kitchen getKitchen() {
		return kitchen;
	}

	public void setKitchen(Kitchen kitchen) {
		this.kitchen = kitchen;
	}

	public Bathroom getBathroom() {
		return bathroom;
	}

	public void setBathroom(Bathroom bathroom) {
		this.bathroom = bathroom;
	}

	public Bedroom getBedroom() {
		return bedroom;
	}

	public void setBedroom(Bedroom bedroom) {
		this.bedroom = bedroom;
	}

	public WC getWc() {
		return wc;
	}

	public void setWc(WC wc) {
		this.wc = wc;
	}

	public Studyroom getStudyroom() {
		return studyroom;
	}

	public void setStudyroom(Studyroom studyroom) {
		this.studyroom = studyroom;
	}

	public LivingRoom getLivingRoom() {
		return livingRoom;
	}

	public void setLivingRoom(LivingRoom livingRoom) {
		this.livingRoom = livingRoom;
	}
	
}
