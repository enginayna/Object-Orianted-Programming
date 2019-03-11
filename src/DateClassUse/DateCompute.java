package DateClassUse;

import java.util.Date;

public class DateCompute {

	public static void main(String[] args) {
		Date history = new Date();
		// Date s�n�f�n� k�t�phaneden al�p kullanmak i�in yeni nesne olu�turuyoruz
		// Date s�n�f�n� import ediyoruz. --- import java.util.Date;----

		System.out.println(history.toString());
		// toString metodu ile yazd�rabiliyoruz.

		java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
		// java.sql.date metodu bizden 1 ocak 1970 den bu g�ne ge�en mili saniyeyi al�r
		// bize �uan�n saaatini ve tarihini bildirir.

		System.out.println(date.toString());
		// toString metodu ile sadece tarihi yaz�d�r.

		System.out.println(date.toLocaleString());
		// toLocalString motodu local tarih ve saati local dilde g�sterir. fakat
		// kullan�mdan kalkm��t�r.

	}
}
