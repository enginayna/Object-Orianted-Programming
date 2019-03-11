package �nheritance;

public class Student extends Staff {
	private int studentNumber;

	Student() {

	}

	public Student(String name, String surname, int age, int studentNumber) {
		super(name, surname, age);
		// super keyword ile extends etti�imiz staff s�n�f�n� metodlar� ve de�i�kenleri ile miras al�r�z.
		
		this.studentNumber = studentNumber;
		
		/*
		 * Yeni s�n�f�m�zda miras ald�g�m�z de�i�ken yada metodlar d���nda olu�turaca��m�z de�i�ken ve metodlar� 
		 * kendimiz belirleriz ve contructor i�inde kendimiz tan�mlar�z.
		 */

	}

	public String toString() {

		return super.toString() + " " + studentNumber;
		
		/*super.toString metodu ile Staff s�n�f�m�zdaki toString metodunu kullan�r�z ve override ederek
		 * yeni de�i�kenimizi ekleyebiliriz.
		 * 
		 *  E�er override etmezsek toString metodu ile miras ald�g�m�z de�i�kenleri yazd�rabiliriz.
		 */
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

}
