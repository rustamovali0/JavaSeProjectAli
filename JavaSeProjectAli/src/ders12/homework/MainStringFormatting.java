package ders12.homework;

public class MainStringFormatting {
public static void main(String[] args) {
	
	String name="Yusif";
	int age=29;
	
   System.out.printf("Hello %s your age is = %d %f %c %b", name,age,3.6,'D',false).println();;	
	
	String a =String.format("Hello %s your age is = %d %f %c %b", name,age,3.6,'D',false);
	System.out.println(a);
}
}
