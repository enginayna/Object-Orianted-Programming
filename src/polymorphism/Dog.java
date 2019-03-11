package polymorphism;

public class Dog
	 extends Animal{
	
	private String type;

	public Dog() {
		
	}

	public Dog(int price) {
		super(price);
		// TODO Auto-generated constructor stub
	}

	public Dog(int price, String type) {
		super(price);
		this.type = type;
	}
	public void showInformaitons() {
		System.out.println("Price : " + getPrice() + " Type : " + getType());
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
