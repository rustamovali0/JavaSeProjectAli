package ders12.homework;

import java.util.Iterator;

public class MainStringBuilderExample {

	public static void main(String[] args) {

   /*  String s="";
        System.out.println("begin");
		for (int i = 0; i <=300_000; i++) {
			  s=s+"Java";
			 
		}
		System.out.println("end");

	
*/
		
StringBuilder sb = new StringBuilder("");
System.out.println("begin");
for (int i = 0; i <=300_000; i++) {
	  sb.append("Java");
	 
}
System.out.println("end");

}
		
		
		
}
