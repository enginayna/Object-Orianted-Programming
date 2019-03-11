package Polimorphism;

public class SimpleGeometricObject {
	private String color;
	
	private boolean filled;
	
	private java.util.Date dateCreated;
	
	public SimpleGeometricObject() {
		// TODO Auto-generated constructor stub
		dateCreated = new java.util.Date();
	}
	public SimpleGeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	public String toString() {
		return "created on : " + dateCreated + "\ncolor : " + color + "\nfilled : " + filled;
	}
}
