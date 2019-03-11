package AbstractClass;

public abstract class GeometricObject {

	private String name;
	
	public GeometricObject(String name) {
		this.name = name;
	}
	
	abstract void calculateArea();
	//abstract metotlar " ; " ile boþ olarak tanýmlanýr ve alt sýnýflarda override edilerek çaðýrýlýr.

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	
}
