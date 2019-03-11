package polymorphism;

public class Animal {
	public int price;

	public Animal() {
		
	}
	public Animal(int price) {
	
		this.price = price;
	}
	
	public void showInformations() {
		System.out.println("Price : " + getPrice());
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
