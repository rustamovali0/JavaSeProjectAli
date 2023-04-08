package ders12.homework;

public class StringPoolExample {
	public static void main(String[] args) {

		String name = new String("Yusif");
		String name2 = "Yusif";
		String name3 = "Yusif";
		String name4 = new String("Yusif");
        name=name4;
		System.out.println(name2==name3);
        
		int a=5;
		int b=5;
		System.out.println(a==b);
	
	
	}
}
