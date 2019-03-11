package AbstractClass;

public class Circle extends GeometricObject{
	private double radius;

	public Circle(String name) {
		super(name);
	}

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public void calculateArea() {
		double area =  Math.PI * Math.pow(radius, 2); // Math.PI*radius*radius
		System.out.println(getName() + " is area : " + area + "\n\n");
	}
	
}
