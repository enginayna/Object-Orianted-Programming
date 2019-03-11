package AbstractClass;

public abstract class GeometricObject {

	private String name;
	
	public GeometricObject(String name) {
		this.name = name;
	}
	
	abstract void calculateArea();
	//abstract metotlar " ; " ile bo� olarak tan�mlan�r ve alt s�n�flarda override edilerek �a��r�l�r.

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	
}
