package ders11.varislik;

public class Main2 {
public static void main(String[] args) {
	
	int[] array = {};
	MySort mysort = new MySort();
	BubbleSort bubblesort=new BubbleSort();
	QuickSort quicksort=new QuickSort();
	
	mysort.sort(bubblesort, array);
	mysort.sort(quicksort, array);
	
}
}
