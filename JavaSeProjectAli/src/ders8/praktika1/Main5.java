package ders8.praktika1;

public class Main5 {
	public static void main(String[] args) {

		int[] massiv = { 6, 9, 5, 3, 1 };

		printMyArray(massiv);
		sortMyArray(massiv);
		printMyArray(massiv);
	}

	static void printMyArray(int[] m) {

		for (int i : m) {
			System.out.print(i + " ");

		}
		System.out.println();
	}

	static void sortMyArray(int[] m) {

		boolean swapped = true;
		int counter = 1;
		while (swapped) {
			swapped = false;
			for (int i = 0; i < m.length - counter; i++) {
				if (m[i] > m[i + 1]) {
					int temp = m[i];
					m[i] = m[i + 1];
					m[i + 1] = temp;
					swapped = true;
}}counter++;}}}
		

	

