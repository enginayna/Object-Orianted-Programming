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
			System.out.println("Askerli�imi yapt�m.");
		}else {
			System.out.println("askerli�imi yapmad�m");
		}
		
	}

	@Override
	public String mezuniyetOrtalamas�(double ortalama) {
		
		return "Ortalamam : " + ortalama;
	}

	@Override
	public void adliSicilSorgula() {
		if(adliSicil) {
			System.out.println("Adli sicil kayd�m bulunuyor.");
		}else {
			System.out.println("Adli sicil kayd�m bulunmuyor.");
		}
		
	}

	@Override
	public void isTecr�besi(String[] array) {
		System.out.println("�al��t���m i�yerleri : ");
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

}
