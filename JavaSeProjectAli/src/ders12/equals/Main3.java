package ders12.equals;

public class Main3 {
public static void main(String[] args) throws CloneNotSupportedException {
	
	Person p1 = new Person("Adil",30);
	Person p2 = (Person) p1.clone();
	p1.setName("Kamil");
	
	System.out.println(p1.getName());
	System.out.println(p2.getName());
	
}
}
