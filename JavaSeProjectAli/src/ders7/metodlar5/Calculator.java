package ders7.metodlar5;
public class Calculator {
	public static void main(String[] args) {
		
		Circle c = new Circle(6, 0);
		Calculator.calculateCircleLength(c);

	}
	
public static void  calculateCircleLength(Circle c) {

	
c.length=2*3.14*c.radius;
	
	 System.out.println(c.length);
	

}


}
