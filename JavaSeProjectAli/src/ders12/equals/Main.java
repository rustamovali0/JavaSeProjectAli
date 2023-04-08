package ders12.equals;

public class Main {
public static void main(String[] args) {
	
	Person p1 = new Person("Adil",30);
	Person p2 = new Person("Adil",20);
	System.out.println(p1);
	System.out.println(p2);
	System.out.println(p1.equals(p2));
	
}
}
