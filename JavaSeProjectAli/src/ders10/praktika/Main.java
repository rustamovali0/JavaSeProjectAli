package ders10.praktika;

public class Main {
public static void main(String[] args) {
	//yuvarlaqlasdirma
	double price = 5.235545;
	price*=100;
	price=Math.round(price);
	price/=100.0;
	
	System.out.println(price);
	
	String g=String.format("%.2f", price);
	System.out.println(g);
	
}
}
