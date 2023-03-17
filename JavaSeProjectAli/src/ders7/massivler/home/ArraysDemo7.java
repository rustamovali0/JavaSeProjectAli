package ders7.massivler.home;

public class ArraysDemo7 {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 6 };

		boolean c = true;
	
		for (int eded : a) {

			if (eded % 2 == 0) {
				c = false;
               
			} 
			
			 if (c) {
				System.out.println("sadedir");
			} 
			
			
			else {
				System.out.println("murekkeb");

			}

			
		}
		
	}

}
