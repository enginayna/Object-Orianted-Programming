package SimpleClass2;

public class Car {
	private String colour;
	private int door;
	private int wheel;
	private String power;
	private String model;
	public int age;
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		
		this.door = door;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		if(wheel<0) {
			System.out.println("Number of wheel cant zero");
		}
		this.wheel = wheel;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}
