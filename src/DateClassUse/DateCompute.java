package DateClassUse;

import java.util.Date;

public class DateCompute {

	public static void main(String[] args) {
		Date history = new Date();
		// Date sýnýfýný kütüphaneden alýp kullanmak için yeni nesne oluþturuyoruz
		// Date sýnýfýný import ediyoruz. --- import java.util.Date;----

		System.out.println(history.toString());
		// toString metodu ile yazdýrabiliyoruz.

		java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
		// java.sql.date metodu bizden 1 ocak 1970 den bu güne geçen mili saniyeyi alýr
		// bize þuanýn saaatini ve tarihini bildirir.

		System.out.println(date.toString());
		// toString metodu ile sadece tarihi yazýdýr.

		System.out.println(date.toLocaleString());
		// toLocalString motodu local tarih ve saati local dilde gösterir. fakat
		// kullanýmdan kalkmýþtýr.

	}
}
