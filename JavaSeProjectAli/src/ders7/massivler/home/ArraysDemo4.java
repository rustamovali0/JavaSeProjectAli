package ders7.massivler.home;

public class ArraysDemo4 {
public static void main(String[] args) {
	
	int[] a= {1,2,3,4,6};
		
		
	int maksimumElement=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]>maksimumElement)
			maksimumElement=a[i];
	}
	System.out.println("Maksimum element = "+maksimumElement);
}
}
