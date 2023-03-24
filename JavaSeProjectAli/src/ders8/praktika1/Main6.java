package ders8.praktika1;

public class Main6 {
	public static void main(String[] args) {

		int[] massiv = { 12, 4, 5, 6, 7 };
//reverse
		printMyArray(massiv);
		sortMyArray(massiv);
		reverseMyArray(massiv);
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
				}
			}
			counter++;
		}
	}

	static void reverseMyArray(int[] m) {
		int[] m2 = new int[m.length];
		int o = 0;
		for (int i = m.length - 1; i >= 0; i--) {
			m2[o++] = m[i];
		}
		for (int i = 0; i < m2.length; i++) {
			m[i] = m2[i];
		}
	}
}
