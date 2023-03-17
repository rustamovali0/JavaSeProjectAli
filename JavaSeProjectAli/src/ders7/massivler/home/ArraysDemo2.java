package ders7.massivler.home;

public class ArraysDemo2 {
public static void main(String[] args) {
	
	int[] numbers= {1,2,3,4,6};
	
	
	int a=0;
	int c=0;
		for(int i=0;i<numbers.length;i++)
		{
	      
			c=(a+=numbers[i])/2;
			
		}
		System.out.println(c);
		
}
}
