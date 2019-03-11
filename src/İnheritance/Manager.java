package Ýnheritance;

public class Manager extends Worker { // SubClass

		private String sorumlu_kisi; 
		
	public Manager() {
		
	}

	public Manager(String name, int salary, String department, String sorumlu_kisi) {
		
		super(name, salary, department);
		// super keywordu ile extends ettiðimiz worker sýnýfýnýn contructor ýný kullanabiliyoruz. 
		
		this.sorumlu_kisi = sorumlu_kisi;
		// extends ettiðimiz sýnýfýn veriables dýsýnda veriable define yaparsak bu þekilde yapabilirz.
	}
	public void Work() {
		System.out.println(getDepartment() + " is working...");
	}
	
	public void departmentChange(String newDepartment) { // override etmiþ oluyorz.
		System.out.println("The department is change...");
		setDepartment(newDepartment);
		System.out.println("New department is " + getDepartment());
	}
	public void zamYap(int amount) {
		 int newSalary = getSalary() + amount;
		setSalary(newSalary);
		System.out.println("Çalýþanlara " + amount + " lira zam yapýldý.");
		System.out.println("Worker new salary is " + getSalary());
	}
	
	public String toString() { //override etmiþ olduk
		
		//return getName() + " " + getSalary() + " " + getDepartment() + " " + sorumlu_kisi;
		//super keywordunu kullanarak extends ettiðimiz sýnýfýn metodunu kullanabiliriz. ve kod tekrarý yapmamýþ oluruz
		return super.toString() + " " + sorumlu_kisi;
		//worker sýnýfýndan veriable kullanmak istediðimizde yada deðiþtirmek istediðimizde get ve set edebilirz.
	}


	public String getSorumlu_kisi() {
		return sorumlu_kisi;
	}

	public void setSorumlu_kisi(String sorumlu_kisi) {
		this.sorumlu_kisi = sorumlu_kisi;
	}
	
	
}
