package ders7.massivler.home;

public class ArraysDemo3 {
public static void main(String[] args) {
	
	int[] a= {1,2,3,4,6};
		
		
	int minimumElement=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]<minimumElement)
			minimumElement=a[i];
	}
	System.out.println("Minimum element = "+minimumElement);
}
}
