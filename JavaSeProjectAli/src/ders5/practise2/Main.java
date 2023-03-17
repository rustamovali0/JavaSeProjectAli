package ders5.practise2;

public class Main {

	public static void main(String[] args) {

		//Computer hp = new Computer(12);
	
		Computer dell=hp;
		//Computer dell=new Computer();
		dell.price=2100;
		hp=null;
		hp.price=3000;
		
		System.out.println(dell.price);
		System.out.println(hp.price);
		
	}

}
