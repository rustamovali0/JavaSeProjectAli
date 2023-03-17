package ders7.massivler.home;

public class ArraysDemo {
public static void main(String[] args) {
	
	int[] numbers= {1,2,3,4,5};
	
	
	int a=0;
	
		for(int i=0;i<numbers.length;i++)
		{
	      	a+=numbers[i];
			
		}
		System.out.println(a);
		System.out.println("****");
		for (int i : numbers) {
			System.out.println(i);
		}
}

}
