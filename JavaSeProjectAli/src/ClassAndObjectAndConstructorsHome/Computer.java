package ClassAndObjectAndConstructorsHome;

public class Computer {

	int id;
	String brand;
	String model; 
	String color; 
	
	 
	
    public Computer() {
    //default
    }
	 
	public Computer (String model) 
	{
	System.out.println(model);
	//model qəbul eden
	}
	
	public Computer (String model, String color) {
		//model ve color qebul eden
		System.out.println(model+color);
	}

	
	
	
	
	
}
