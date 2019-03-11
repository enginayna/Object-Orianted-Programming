package polymorphism;

public class Cat 
 	 extends Animal{

	private String type;

	public Cat(int price, String type) {
		super(price);
		this.type = type;
	}
	public void showInformations() {
		System.out.println("Price : " + getPrice() + "Type : " + getType());
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
