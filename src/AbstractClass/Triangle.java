package AbstractClass;

public class Triangle extends GeometricObject{
	//abstract class lar extends keyword ile üst sýnýfý miras alabilir. Ýnherintance de olduðu gibi
	private int side1;
	private int side2;
	private int side3;
	public Triangle(String name) {
		super(name);
		
	}
	public Triangle(String name, int side1, int side2, int side3) {
		super(name);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	@Override
	public void calculateArea() {
		double temp = (side1 + side2 + side3)/2.0;
		
		double area = Math.sqrt(temp * (temp - side1) * (temp - side2) * (temp - side3));
		System.out.println(getName() + " is area : " + area + "\n\n");
	}
	
	
	
}
