package ders11.javatpoint;

public class TestSuper1 {
	public static void main(String[] args) {
		It d = new It();
		d.printColor();
	}
}

class Heyvanlar {
	String color = "white";
}

class It extends Heyvanlar {
	String color = "black";

	void printColor() {
		System.out.println(color);// prints color of Dog class
		System.out.println(super.color);// prints color of Animal class
	}
}