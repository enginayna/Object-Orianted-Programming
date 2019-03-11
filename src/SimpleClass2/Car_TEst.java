package SimpleClass2;

public class Car_TEst {
public static void main(String[] args) {
	Car c1 = new Car();
	c1.setColour("blue");
	System.out.println("The car is " + c1.getColour());
	c1.setWheel(2);
	System.out.println("Car has wheel " + c1.getWheel());
	c1.setDoor(4);
	System.out.println("The car has door " + c1.getDoor());
}
}
