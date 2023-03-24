package ders8.ikiolculu;

public class main4 {
	public static void main(String[] args) {
		
		int result = sumMyArray(1,2,9);
		System.out.println(result);
	}

	static int sumMyArray(int... ededler) {

		int sum =0;
		for (int i : ededler) {
			sum+=i;
		}
		
		return sum;
	}

}


