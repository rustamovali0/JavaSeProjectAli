package ders12.homework;

import java.text.DecimalFormat;

public class MainNumberFormatting {
public static void main(String[] args) {
	
	double d=123.87678;
	String s=String.format("%.2f", d);
	double d2=Double.parseDouble(s);
	System.out.println(d2);
	
	int i=2;
	String s4 = String.format("%02d", i);
	System.out.println(s4);
	
	DecimalFormat decimalFormat = new DecimalFormat("#.000");
	int h1=345;
	String  s7= decimalFormat.format(h1);
	System.out.println(s7);
	
	
}
}
