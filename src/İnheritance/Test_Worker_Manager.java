package �nheritance;

public class Test_Worker_Manager {
public static void main(String[] args) {
	Manager manager = new Manager();
	
	manager.departmentChange("K�le");
	manager.Work();
	manager.departmentChange("Manager");
	manager.Work();
	System.out.println(manager.toString());
	
	Manager m1 = new Manager("Engin", 2000, "Manager" , "Engin Ayna");
	System.out.println(m1.toString());
	m1.departmentChange("K�le");
	System.out.println(m1.toString());
	m1.zamYap(500);
	System.out.println(m1.toString());
}
}
