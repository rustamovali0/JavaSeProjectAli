package ders9.homework2;

public class Person3 {

	public static void main(String[] args) {
		Person3 m1=new Person3(9);
		
		Person3 m2=new Person3(994773313327L);
		
		Person3 m4=new Person3("Salam");
		Person3 m3=new Person3('.');
	}
	
int qiymet;
long number;
char simvol;
String s;

public Person3(int qiymet) {
	System.out.println(qiymet);

}
private Person3(long number) {
	System.out.println(number);

}
protected Person3(char simvol) {
	System.out.println(simvol);

}
public Person3(String s) {
	System.out.println(s);

}


	
}
