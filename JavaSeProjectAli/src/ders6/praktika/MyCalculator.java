package ders6.praktika;

public class MyCalculator {

	int age;

	public void calculateCircleLenght(double radius) {
		if (radius < 0) {
			return;
		}
		double result = 2 * 3.14 * radius;
		System.out.println("radiusu " + radius 
	+ " " + "olan cevrenin " + "uzunlugu = " + result);
	}

	public double calculateCircleLenght2(double radius) {
		double result = 2 * 3.14 * radius;
		return result;
		// metodlarin geri deyer qaytarmasi
	}

	public void calculateCircleLenght3(Circle c) {

		c.length = c.radius * 2 * 3.14;

	}

}