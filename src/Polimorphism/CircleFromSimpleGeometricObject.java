package Polimorphism;

public class CircleFromSimpleGeometricObject
	 extends SimpleGeometricObject{
	
	private double radius; 
	public CircleFromSimpleGeometricObject() {
	// TODO Auto-generated constructor stub
	}
	
	public CircleFromSimpleGeometricObject(double radius) {
		this.radius = radius;
	}
	
	public CircleFromSimpleGeometricObject(double radius , String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}
	
	public double getArea() { 
		return Math.pow(radius, 2)*Math.PI;
	}
	
	public double getDimeter() { 
		return 2*radius;
	}
	
	public double getPerimeter() { 
		return 2 * Math.PI * radius;
	}
	
	public String toString() {
		return super.toString() + "\nradius is : " + radius; 
	}
	public void printCircle() {
		System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
