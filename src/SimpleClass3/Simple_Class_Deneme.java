package SimpleClass3;

public class Simple_Class_Deneme {
public static void main(String[] args) {
	Simple_Class sc = new Simple_Class();// nesne bu �ekilde olu�turuluyor.
	
	
	System.out.println(sc.age + " " +  sc.eyes_color + " " + sc.name + " " + sc.surname); 
	//sc.high de�eri private oldugu i�in c�kar�ld�.
	//de�i�kenlerin ilk de�erlerini yazd�rmak i�in nesne olu�turup yazd�rabiliriz.
	
	
	
	sc.age = 25;
	sc.eyes_color = "purple";
	
	System.out.println(sc.age + " " + sc.eyes_color);
	// public de�i�kenler metot kullanmadan de�i�tirilebilir.
	
	
	sc.setHigh(180);
	System.out.println(sc.getHigh());
	//private de�i�kenler setter getter methodlar olmadan i�lem yap�lam�yor.
	
	
	System.out.println(Simple_Class.number);
    //Static de�erler direk s�n�fa ba�l�d�r. s�n�f� kullanarak de�i�tirebiliriz. Nesne yaratmaya gerek yok.
	
	Simple_Class sc1 = new Simple_Class(20, 175, "blue", "salako", "malako");
	//Constructor ile direk nesne olu�tururken ilk de�er atamas� yapabiliriz
	//Bunun i�in constructor olu�turulabilir.
	
	System.out.println(sc1.toString());
	
}
}
