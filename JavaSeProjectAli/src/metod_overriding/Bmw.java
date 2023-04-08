package metod_overriding;

public class Bmw extends Car{
   @Override
public void start() {
		System.out.println("Bmw getmeye baslayir");
	
   }
	
   public void startBmw() {
	   System.out.println("startBmw");
   }
}
