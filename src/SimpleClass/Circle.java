package SimpleClass;

public class Circle {
	double radius;
Circle(){
	radius = 1;
	/*
	 * Construct 
	 * Eðer her atama yapýlmadýgýnda deðiþkenin sabit bir deðer taþýmasýný istiyorsak burada tanýmlarýz.
	 */
}
Circle(double newRadius){
	radius = newRadius;
	/*,
	 * Deðiþkenlerin deðiþimi için bu metodu kullanýrýz. nesneyi oluþtuan kiþi deðiþleni bu metot ile deðiþtirebilir.
	 */
}
double getArea() {
	return radius*radius*Math.PI;
	/*
	 * klasik hesaplamalarý yapmak için oluþturulan dönüþ deðeri olan metot
	 */
}
double perimeter() {
	return 2*radius*Math.PI;
	/*
	 * çevre hesaplamasý yapan geri dönüþ deðeri olan baþka bir metot
	 */
}
double setRadius(double newRadius) {
	return radius = newRadius;
	/*
	 * Class adý dýsýnda hesaplanmasý için oluþturulan bir metot var ise ve ayný deðiþkeni kullanýyorsa
	 * (radius) o zaman onun için yeni metot açýlýr ve klasik metotlar gibi geri dönüþ deðeri olur.
	 * Class adýndaki metot return yapmaya gerek duymaz. 
	 */
	}

}
