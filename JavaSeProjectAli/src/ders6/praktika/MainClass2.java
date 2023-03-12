package ders6.praktika;

public class MainClass2 {

	public static void main(String[] args) {

		Circle myCircle = new Circle();

		myCircle.radius = 6.2;

		MyCaculator calculator = new MyCaculator();

		calculator.calculateCircleLenght3(myCircle);
		
		System.out.println(myCircle.length);

	}

}
