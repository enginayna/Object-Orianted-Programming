package Ýnheritance;

public class Test_Staff_Studend {
public static void main(String[] args) {
	Staff staff = new Staff("Engin", "Ayna", 26);
	Student student = new Student("Engin", "Ayna", 26, 1448);
	
	System.out.println(staff.toString());
	System.out.println(student.toString());
	
	Staff sdf = new Student("engin", "ayna", 24, 546);
	System.out.println(sdf.toString());
	
}
}
