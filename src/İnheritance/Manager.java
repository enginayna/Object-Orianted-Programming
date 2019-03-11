package �nheritance;

public class Manager extends Worker { // SubClass

		private String sorumlu_kisi; 
		
	public Manager() {
		
	}

	public Manager(String name, int salary, String department, String sorumlu_kisi) {
		
		super(name, salary, department);
		// super keywordu ile extends etti�imiz worker s�n�f�n�n contructor �n� kullanabiliyoruz. 
		
		this.sorumlu_kisi = sorumlu_kisi;
		// extends etti�imiz s�n�f�n veriables d�s�nda veriable define yaparsak bu �ekilde yapabilirz.
	}
	public void Work() {
		System.out.println(getDepartment() + " is working...");
	}
	
	public void departmentChange(String newDepartment) { // override etmi� oluyorz.
		System.out.println("The department is change...");
		setDepartment(newDepartment);
		System.out.println("New department is " + getDepartment());
	}
	public void zamYap(int amount) {
		 int newSalary = getSalary() + amount;
		setSalary(newSalary);
		System.out.println("�al��anlara " + amount + " lira zam yap�ld�.");
		System.out.println("Worker new salary is " + getSalary());
	}
	
	public String toString() { //override etmi� olduk
		
		//return getName() + " " + getSalary() + " " + getDepartment() + " " + sorumlu_kisi;
		//super keywordunu kullanarak extends etti�imiz s�n�f�n metodunu kullanabiliriz. ve kod tekrar� yapmam�� oluruz
		return super.toString() + " " + sorumlu_kisi;
		//worker s�n�f�ndan veriable kullanmak istedi�imizde yada de�i�tirmek istedi�imizde get ve set edebilirz.
	}


	public String getSorumlu_kisi() {
		return sorumlu_kisi;
	}

	public void setSorumlu_kisi(String sorumlu_kisi) {
		this.sorumlu_kisi = sorumlu_kisi;
	}
	
	
}
