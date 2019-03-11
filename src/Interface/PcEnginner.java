package Interface;

public class PcEnginner implements IEngineer{
	private boolean askerlik;
	private boolean adliSicil;
	public PcEnginner(boolean askerlik, boolean adliSicil) {
		
		this.askerlik = askerlik;
		this.adliSicil = adliSicil;
	}

	@Override
	public void askerlikDurumuSorgula() {
		if(askerlik) {
			System.out.println("Askerliðimi yaptým.");
		}else {
			System.out.println("askerliðimi yapmadým");
		}
		
	}

	@Override
	public String mezuniyetOrtalamasý(double ortalama) {
		
		return "Ortalamam : " + ortalama;
	}

	@Override
	public void adliSicilSorgula() {
		if(adliSicil) {
			System.out.println("Adli sicil kaydým bulunuyor.");
		}else {
			System.out.println("Adli sicil kaydým bulunmuyor.");
		}
		
	}

	@Override
	public void isTecrübesi(String[] array) {
		System.out.println("Çalýþtýðým iþyerleri : ");
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

}
