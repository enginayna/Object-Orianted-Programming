package Ýnheritance;

public class Worker { //Super Class
	private String name;
	
	private int salary;
	
	private String department;
	
	public Worker() {
		name = "Yok";
		salary = 0;
		department = "Bilinmiyor";
		
	}
	 
	public Worker(String name, int salary, String department) {
		
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	public void Work() {
		System.out.println("The worker is works...");
	}
	public String toString() {
		return name + " " + salary + " " + department;
	}
	
	public void departmentChange(String newDepartment) {
		System.out.println("The Department is change... ");
		department = newDepartment;
		System.out.println("New depatment is " + newDepartment);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
	
}
