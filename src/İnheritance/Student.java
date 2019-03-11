package Ýnheritance;

public class Student extends Staff {
	private int studentNumber;

	Student() {

	}

	public Student(String name, String surname, int age, int studentNumber) {
		super(name, surname, age);
		// super keyword ile extends ettiðimiz staff sýnýfýný metodlarý ve deðiþkenleri ile miras alýrýz.
		
		this.studentNumber = studentNumber;
		
		/*
		 * Yeni sýnýfýmýzda miras aldýgýmýz deðiþken yada metodlar dýþýnda oluþturacaðýmýz deðiþken ve metodlarý 
		 * kendimiz belirleriz ve contructor içinde kendimiz tanýmlarýz.
		 */

	}

	public String toString() {

		return super.toString() + " " + studentNumber;
		
		/*super.toString metodu ile Staff sýnýfýmýzdaki toString metodunu kullanýrýz ve override ederek
		 * yeni deðiþkenimizi ekleyebiliriz.
		 * 
		 *  Eðer override etmezsek toString metodu ile miras aldýgýmýz deðiþkenleri yazdýrabiliriz.
		 */
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

}
