package SimpleClass;

public class Circle {
	double radius;
Circle(){
	radius = 1;
	/*
	 * Construct 
	 * E�er her atama yap�lmad�g�nda de�i�kenin sabit bir de�er ta��mas�n� istiyorsak burada tan�mlar�z.
	 */
}
Circle(double newRadius){
	radius = newRadius;
	/*,
	 * De�i�kenlerin de�i�imi i�in bu metodu kullan�r�z. nesneyi olu�tuan ki�i de�i�leni bu metot ile de�i�tirebilir.
	 */
}
double getArea() {
	return radius*radius*Math.PI;
	/*
	 * klasik hesaplamalar� yapmak i�in olu�turulan d�n�� de�eri olan metot
	 */
}
double perimeter() {
	return 2*radius*Math.PI;
	/*
	 * �evre hesaplamas� yapan geri d�n�� de�eri olan ba�ka bir metot
	 */
}
double setRadius(double newRadius) {
	return radius = newRadius;
	/*
	 * Class ad� d�s�nda hesaplanmas� i�in olu�turulan bir metot var ise ve ayn� de�i�keni kullan�yorsa
	 * (radius) o zaman onun i�in yeni metot a��l�r ve klasik metotlar gibi geri d�n�� de�eri olur.
	 * Class ad�ndaki metot return yapmaya gerek duymaz. 
	 */
	}

}
