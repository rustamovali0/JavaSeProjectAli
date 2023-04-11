package ders14.homework1;

public class Employee extends Person {
	int salary;
	String department;
	String username;
	String password;
	
	public void printInfo1() {
		printInfo();
		System.out.println(salary+department+username+password);

	}
	public static void main(String[] args) {
		
		Employee em = new Employee();
		em.department=null;
		em.salary=2000;
		em.username="admin";
		em.password="admin1";
		em.printInfo1();
	}
}
