package ArrayList;

import java.util.ArrayList;

public class Simple_ArrayList {
public static void main(String[] args) {
	
	ArrayList<String> array = new ArrayList<String>(); 
	ArrayList<Integer> arrays = new ArrayList<Integer>();
	//Arraylistler bu �ekilde tan�mlan�r. K���kt�r b�y�kt�r ifadesinin i�ine hangi primitif tip oldugunu yazar�z.
	//-- Arraylistlerin arraylerden fark� geni�letilebilir olmas�d�r.
	
	array.add("Engin");
	array.add("Gamze");
	array.add("Ahmet");
	array.add("Zeynep");
	array.add("Sevgi");
	array.add("Sevgi");
	array.add(0, "Bilinmiyor");
	//array.add(" "); ile arraylist e ekleme yap�l�r.
	
	array.remove(2); // ---remove--- kald�rmak ��karmak demektir.
	array.remove("Engin");
	//array.remove(); ile ister index say�s� ister primitirf tipin kendisi belirtilerek silme yap�labilir.
	
	System.out.println("array.get(3) : " + array.get(3));
	//array.get(3) ile olu�an arraylistimizin 3. indexindeki de�er yazd�r�l�r.
	
	System.out.println("array.indexOf(asdasd) : " + array.indexOf("asdasd"));
	//arra.indexOf("asdasd") ile String de�er ile arama yap�l�r. E�er aranan de�er var ise bulundu�u index geri d�ner.
	
	System.out.println("array.indexOf(Engin) : " + array.indexOf("Engin") );
	//Aranan de�er yok ise -1 sonucu geri d�ner.
	
	System.out.println(array.indexOf("Sevgi"));
	
	System.out.println(array.lastIndexOf("Sevgi"));
	//lastIndexOf("Sevgi") ile arraylistin i�inde ayn� de�er var ise birinci de�il ikinci de�erin indexi d�ner.
	
	System.out.println("array.size() : " + array.size()); // size = boyut b�y�kl�k demektir.
	//array.size() ile arraylistin boyutunu yazd�rabiliriz.
	
	array.set(0, "Bilinmiyor."); // arraylistin index say�s�n� al�r ve set eder.
	System.out.println(array.get(0));
	String a = "Engin";
	System.out.println(array.indexOf(a));
	//array.indesOf(); metoduna varolan string de�erini g�ndederebiliriz.
	
	printArray(array);
	
	
	
}
public static void printArray(ArrayList<String> array_adi) {
	for (int i = 0; i < array_adi.size(); i++) {
		System.out.print(array_adi.get(i) + "\n");
		//Arraylistler metoda bu �ekilde g�nderilir.
	}
}
}
