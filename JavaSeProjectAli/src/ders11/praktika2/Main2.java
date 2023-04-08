package ders11.praktika2;

public class Main2 {
public static void main(String[] args) {
	
}
}


abstract class Canli{
	double ceki; 
	String reng;
	
	abstract void hereketEt();
	
}


class Bitki extends Canli{

	@Override
	void hereketEt() {
		System.out.println("Kuleye bagliyam");
		
	}
	
}

class NefesAlan extends Canli{

	@Override
	void hereketEt() {
		System.out.println("men bilmirem");
		
	}
	

}

class Insan extends NefesAlan{
	@Override
	void hereketEt() {
		System.out.println("addim liyayan gezen");
		
	}
	
   
}

