package ClassAndObjectAndConstructorsHome;

public class Computer {

	int id;
	String brand;
	String model; 
	String color; 
	
	 
	
    public Computer() {
   
    }
	 
	public Computer (String model) 
	{
	System.out.println(model);
	}
	
	public Computer (String model, String color) {
		System.out.println(model+color);
	}

	
	
	
	
	
}
