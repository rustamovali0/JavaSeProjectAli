package ders4.homework;

public class mainclass {

	public static void main(String[] args) {

		Person a1=new Person();
		a1.id=123;
		a1.name="Ali";
		a1.surname="Rustamov";
		a1.age=21;
		a1.phone=055455454;
	    a1.printPersoninfo();
	    System.out.println("-_-_-_-_-_-_-");
	    Person a2=new Person();
	    a2.id=124;
		a2.name="Resul";
		a2.surname="Rustamov";
		a2.age=13;
		a2.phone=0114745;
	    a2.printPersoninfo();
	}

}
