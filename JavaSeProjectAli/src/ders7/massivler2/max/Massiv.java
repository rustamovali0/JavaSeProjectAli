package ders7.massivler2.max;
public class Massiv {
public static void main(String[] args) {
	
double[] a= {1.9,2.9,3.4,3.5};
System.out.println("-----------------------");
System.out.println("Massiv elementleri");
System.out.println("-----------------------");
for(int i=0; i<a.length;i++) {
	System.out.println(a[i]);
}
	System.out.println("------------------");
	double massivinElementleriCemi=0;
	for(int i=0;i<a.length;i++) {
		massivinElementleriCemi+=a[i];
	}
	System.out.println("Cem = "+massivinElementleriCemi);
	System.out.println("---------------------------");
	double maksimumElement=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]>maksimumElement)
			maksimumElement=a[i];
	}
	System.out.println("Maksimum element = "+maksimumElement);
	System.out.println("---------------------------");
	
	
	
}

}
