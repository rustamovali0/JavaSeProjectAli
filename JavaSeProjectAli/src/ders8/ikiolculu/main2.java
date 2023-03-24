package ders8.ikiolculu;

public class main2 {
	public static void main(String[] args) {
		int[] massivim = { 6, 5, 12, 54 };
		int result = sumMyArray(massivim);
		System.out.println(result);
	}

	static int sumMyArray(int[] massiv) {

		int sum = 0;
		for (int i : massiv) {
			sum += i;
		}
		return sum;
	}

}