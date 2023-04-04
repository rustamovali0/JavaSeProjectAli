package ders11.javatpoint;

public class TestInheritance3 {

	public static void main(String[] args) {
		
		cat c = new cat();
		c.meov();
		c.eat();
System.out.println("----------");
        Dog d = new Dog();
        d.bark();
        d.eat();
		
	}
}
	class Animal{
		void eat() {
		System.out.println("eating.... ");	
		}
		}
	class Dog extends Animal{
		void bark() {
			System.out.println("barking... ");
		}
	}
	class cat extends Animal{
		void meov() {
			System.out.println("meowing... ");
		}

		
	}
	
	
	
	

