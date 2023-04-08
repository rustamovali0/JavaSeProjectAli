package ders12.homework;

public class MainWrapperClasses {
public static void main(String[] args) {

	int a=12;
	System.out.println(a);
	
	Integer b = new Integer(12);
	
	b.byteValue();
int c=Integer.parseInt("123");	
	System.out.println(c);
	System.out.println(Integer.toHexString(23));
	int t = Integer.valueOf("101,8");
	System.out.println(t);
	
	boolean j =Boolean.parseBoolean("true");
	System.out.println(j);
	
}
}
