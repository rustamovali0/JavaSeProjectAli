package homeworkfebuary4;

public class practise8 {

	public static void main(String[] args) {

		int number = 316;
		
		boolean sade = true;
		
		for (int i = 2; i <=number-1; i++) {
			
			if (number%i==0)
			{
				sade=false;
				break;
			}
			}
			if (sade) {
				System.out.println("eded sadedir");
				
			}
			else {
				System.out.println("eded murekkebdir");
			}
			
		
		
		
		
		
	}

}
