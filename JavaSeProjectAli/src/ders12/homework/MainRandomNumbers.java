package ders12.homework;

import java.util.Random;

public class MainRandomNumbers {

	public static void main(String[] args) {

		Random r = new Random();
		int i=r.nextInt();
		int i2 =r.nextInt(6)+1;
		System.out.println(i2);
		
		r.nextInt(5,12);
		
		
		
		
	}

}
