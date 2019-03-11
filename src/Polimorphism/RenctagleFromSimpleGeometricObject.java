package Polimorphism;

public class RenctagleFromSimpleGeometricObject
 	 extends SimpleGeometricObject{
	
	private double width; // geniþlik
	
	private double height; // yükseklik
	
	public RenctagleFromSimpleGeometricObject() {
		// TODO Auto-generated constructor stub
	}
	
	public RenctagleFromSimpleGeometricObject(double width , double height) {
		
		this.width = width;
		this.height = height;
	}
	public RenctagleFromSimpleGeometricObject(double width , double height , String color , boolean filled) {
		
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return 2*(width + height);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	

}
