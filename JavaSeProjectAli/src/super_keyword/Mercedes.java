package super_keyword;

public class Mercedes extends Car{

	void startMercedes() {
		System.out.println("startMercedes");
		super.starts();
		super.maxSpeed=400;
		
		
	}
	
	Mercedes(){
		super(true);
		System.out.println("");
		
	}
Mercedes(int a){
	
}
}
