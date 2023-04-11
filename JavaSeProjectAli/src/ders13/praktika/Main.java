package ders13.praktika;

public class Main {

	public static void main(String[] args) {

		Person p1 = new Person("Resad",23);
		Person p2 = new Person("Nadir",23);
		int hashCode1=p1.hashCode();
		int hashCode2=p2.hashCode();
     
		 System.out.println(hashCode1);
		 System.out.println(hashCode2);		
		
	}

}
