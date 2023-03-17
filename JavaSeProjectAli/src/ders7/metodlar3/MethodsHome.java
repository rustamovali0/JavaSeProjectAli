package ders7.metodlar3;

public class MethodsHome {

public static void main(String[] args) {
		
	
		printNumbers(5, 10);
		System.out.println("***");
		printNumbers(7, 15);
		System.out.println("****");
		printNumbers(15, 25);
	}
	
	static void printNumbers(int begin,int end) {
		
		for(int i=begin;i<=end;i++) {
			
			System.out.println(" "+i);
		

		}
	}
	
}

	

