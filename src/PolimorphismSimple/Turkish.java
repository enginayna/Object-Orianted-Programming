package PolimorphismSimple;

public class Turkish
	 extends Human{

	private String eyeColor;
	
	Turkish(){
		
	}
	Turkish(String eyeColor){
		this.eyeColor = eyeColor;
	}
	Turkish(String name, int age, int height, int weight, String eyeColor){
		super(name, age, height, weight);
		this.eyeColor = eyeColor;
	}
	
	/*public String toString() {
		return super.toString() + "\neyecolor : " + eyeColor;
	}*/
	public String getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	
}
