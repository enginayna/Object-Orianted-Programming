package SimpleClass;

public class Circle_Area_compute {
public static void main(String[] args) {
	Circle c1 = new Circle();
	
	c1.radius = 5;
	System.out.printf("%4.2f" , c1.getArea());
	System.out.println();
	
	Circle c2 = new Circle();
	c2.setRadius(3);
	System.out.printf("%4.2f" , c2.perimeter());
	System.out.println();
	
	Circle c3 = new Circle();
	System.out.printf("%4.2f" , c3.getArea());
	
}
}
