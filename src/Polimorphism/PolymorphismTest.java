package Polimorphism;

public class PolymorphismTest {
public static void main(String[] args) {
	displayObject(new CircleFromSimpleGeometricObject(2, "yellow", false));
	displayObject(new RenctagleFromSimpleGeometricObject(1, 1, "black", true));
	SimpleGeometricObject ee = new CircleFromSimpleGeometricObject();
}
public static void displayObject(SimpleGeometricObject object) {
	System.out.println("Created on : " + object.getDateCreated() + "Color is : " + object.getColor());
}

}
