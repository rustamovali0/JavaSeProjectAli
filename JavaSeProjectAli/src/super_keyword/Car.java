package super_keyword;

public class Car {

	int currentSpeed;
	int maxSpeed;
	boolean running;
	
	Car(boolean running){
		maxSpeed=240;
		this.running=true;
		currentSpeed=10;
	}
	
	
	void starts() {
		System.out.println("Masin ise dusdu");
	}
	void stop() {
		System.out.println("Masin dayandi");
	}
	
}
