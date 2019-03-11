package SimpleClass3;

public class Simple_Class_Deneme {
public static void main(String[] args) {
	Simple_Class sc = new Simple_Class();// nesne bu þekilde oluþturuluyor.
	
	
	System.out.println(sc.age + " " +  sc.eyes_color + " " + sc.name + " " + sc.surname); 
	//sc.high deðeri private oldugu için cýkarýldý.
	//deðiþkenlerin ilk deðerlerini yazdýrmak için nesne oluþturup yazdýrabiliriz.
	
	
	
	sc.age = 25;
	sc.eyes_color = "purple";
	
	System.out.println(sc.age + " " + sc.eyes_color);
	// public deðiþkenler metot kullanmadan deðiþtirilebilir.
	
	
	sc.setHigh(180);
	System.out.println(sc.getHigh());
	//private deðiþkenler setter getter methodlar olmadan iþlem yapýlamýyor.
	
	
	System.out.println(Simple_Class.number);
    //Static deðerler direk sýnýfa baðlýdýr. sýnýfý kullanarak deðiþtirebiliriz. Nesne yaratmaya gerek yok.
	
	Simple_Class sc1 = new Simple_Class(20, 175, "blue", "salako", "malako");
	//Constructor ile direk nesne oluþtururken ilk deðer atamasý yapabiliriz
	//Bunun için constructor oluþturulabilir.
	
	System.out.println(sc1.toString());
	
}
}
