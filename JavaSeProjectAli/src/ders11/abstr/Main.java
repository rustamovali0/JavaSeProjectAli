package ders11.abstr;

public class Main {

	public static void main(String[] args) {
		
		Animal pitbul = new Dog();
		pitbul.makeNoise();

		
		Animal mestan = new Cat();
		mestan.makeNoise();
		
		
		Animal[] animals = new Animal[3];
		animals[0]=mestan; 
		animals[1]=pitbul;
		animals[2]=new Zurafe();
		
		for (Animal animal : animals) {
			animal.makeNoise();
			animal.adiMetod();
			System.out.println("============");
		}
		
		
		
		
		
		
		
		
	}

}
