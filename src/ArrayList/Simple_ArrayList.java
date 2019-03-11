package ArrayList;

import java.util.ArrayList;

public class Simple_ArrayList {
public static void main(String[] args) {
	
	ArrayList<String> array = new ArrayList<String>(); 
	ArrayList<Integer> arrays = new ArrayList<Integer>();
	//Arraylistler bu þekilde tanýmlanýr. Küçüktür büyüktür ifadesinin içine hangi primitif tip oldugunu yazarýz.
	//-- Arraylistlerin arraylerden farký geniþletilebilir olmasýdýr.
	
	array.add("Engin");
	array.add("Gamze");
	array.add("Ahmet");
	array.add("Zeynep");
	array.add("Sevgi");
	array.add("Sevgi");
	array.add(0, "Bilinmiyor");
	//array.add(" "); ile arraylist e ekleme yapýlýr.
	
	array.remove(2); // ---remove--- kaldýrmak çýkarmak demektir.
	array.remove("Engin");
	//array.remove(); ile ister index sayýsý ister primitirf tipin kendisi belirtilerek silme yapýlabilir.
	
	System.out.println("array.get(3) : " + array.get(3));
	//array.get(3) ile oluþan arraylistimizin 3. indexindeki deðer yazdýrýlýr.
	
	System.out.println("array.indexOf(asdasd) : " + array.indexOf("asdasd"));
	//arra.indexOf("asdasd") ile String deðer ile arama yapýlýr. Eðer aranan deðer var ise bulunduðu index geri döner.
	
	System.out.println("array.indexOf(Engin) : " + array.indexOf("Engin") );
	//Aranan deðer yok ise -1 sonucu geri döner.
	
	System.out.println(array.indexOf("Sevgi"));
	
	System.out.println(array.lastIndexOf("Sevgi"));
	//lastIndexOf("Sevgi") ile arraylistin içinde ayný deðer var ise birinci deðil ikinci deðerin indexi döner.
	
	System.out.println("array.size() : " + array.size()); // size = boyut büyüklük demektir.
	//array.size() ile arraylistin boyutunu yazdýrabiliriz.
	
	array.set(0, "Bilinmiyor."); // arraylistin index sayýsýný alýr ve set eder.
	System.out.println(array.get(0));
	String a = "Engin";
	System.out.println(array.indexOf(a));
	//array.indesOf(); metoduna varolan string deðerini göndederebiliriz.
	
	printArray(array);
	
	
	
}
public static void printArray(ArrayList<String> array_adi) {
	for (int i = 0; i < array_adi.size(); i++) {
		System.out.print(array_adi.get(i) + "\n");
		//Arraylistler metoda bu þekilde gönderilir.
	}
}
}
