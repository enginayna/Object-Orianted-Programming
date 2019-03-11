package AbstractClass;

public class Square extends GeometricObject {
	private double side;

	public Square(String name) {
		super(name);
		
	}

	public Square(String name, double side) {
		super(name);
		this.side = side;
	}

	@Override
	public void calculateArea() {
		double area = Math.pow(side, 2);
		System.out.println(getName() + " is area : " + area + "\n\n");
	}
	
}
