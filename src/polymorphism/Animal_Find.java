package polymorphism;

public class Animal_Find {

	public Animal animalFind(String name) {
		if(name.equals("cat")) {
			return new Cat(200, "sazan");
		}
		else if(name.equals("Dog")) {
			return new Dog(300, "Sivas kangalý");
		}
		else {
			return new Animal();
		}
	}
}
