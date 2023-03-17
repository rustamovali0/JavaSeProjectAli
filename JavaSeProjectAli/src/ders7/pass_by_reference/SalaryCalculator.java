package ders7.pass_by_reference;

public class SalaryCalculator {

	public static void caculateSalary(Person p) {
		p.salary=500*p.experienceYear;
	}
}
