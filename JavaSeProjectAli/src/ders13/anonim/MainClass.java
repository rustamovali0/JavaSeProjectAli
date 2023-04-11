package ders13.anonim;

public class MainClass {

	public static void main(String[] args) {
		Eatable yeyen = new Eatable() {
			
			@Override
			public void eat() {
				
				System.out.println("Cat yeyir");
				
			}
		};
		yeyen.eat();

	}

}
