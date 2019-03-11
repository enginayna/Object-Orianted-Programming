package Interface;

public class Test_Engineer {
public static void main(String[] args) {
	IEngineer engineer = new PcEnginner(true, false);
	engineer.adliSicilSorgula();
	engineer.askerlikDurumuSorgula();
	System.out.println(engineer.mezuniyetOrtalamasý(3.45));
	String[] array = {"Ali","veli","deli"};
	engineer.isTecrübesi(array);
	
}
}
