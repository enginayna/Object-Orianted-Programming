package SimpleClass3;

public class Simple_Class {
	public int age;
	private int high;
	public String eyes_color;
	public String name;
	public String surname;
	public static int number;
	
	
	

	public Simple_Class() {
		/*
		 * Yap�land�r�c� method --constructor--
		 */
		this(12 , 170, "siyah" , "engin" , "Ayna");
		// this kullanarak s�ras�yla de�i�kenlere ilk de�erlerini atayabiliriz.
		
		number =7;
		//static de�erlere ilk de�er yine contructor i�inde atanabilir.
	}

	public Simple_Class(int age, int high, String eyes_color , String name, String surname) {
		this.age = age;
		this.eyes_color = eyes_color;
		this.high = high;
		this.name = name;
		this.surname = surname;
	}
	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}
	public String toString() {
		return ("Age : " + age + "\nHigh : " + high + "\nEyes color : " + eyes_color + "\nName : " + name
				+ "\nSurname : " + surname);	

	}
	
	
}
