package Polimorphism;

public class TestCircleRenctagle {
public static void main(String[] args) {

		CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(1);
		System.out.println("A circle " + circle.toString());
		System.out.println("The color is " + circle.getColor());
		System.out.println("The radius is " + circle.getRadius());
		System.out.println("The area is " + circle.getArea());
		System.out.println("The perimeter is " + circle.getDimeter());
		
		RenctagleFromSimpleGeometricObject renctagle = new RenctagleFromSimpleGeometricObject(2 , 4);
		System.out.println("\nA renctagle " + renctagle.toString());
		System.out.println("The area is " + renctagle.getArea());
		System.out.println("The perimeter is " + renctagle.getPerimeter());
		
		
}

}
