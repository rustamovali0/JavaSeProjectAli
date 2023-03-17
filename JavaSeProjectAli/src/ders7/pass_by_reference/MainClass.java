package ders7.pass_by_reference;

public class MainClass {

	public static void main(String[] args) {
	
		Person p=new Person("Adil","Eliyev" , 7, 0, "088");
		SalaryCalculator.caculateSalary(p);
		System.out.println(p.salary);
		
		
		
	}
}
