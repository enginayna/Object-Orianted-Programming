package PolimorphismSimple;

public class Human {

	private String name;
	
	private int age;
	
	private int height;
	
	private int weight;
	
	Human(){
		
	}
	
	Human(String name, int age, int height, int weight){
		this.age = age;
		this.height = height;
		this.name = name;
		this.weight = weight;
	}
	
	public String toString() {
		return "Name : " + name + "\nage : " + age + "\nheight : " + height + "\nweight : " + weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
