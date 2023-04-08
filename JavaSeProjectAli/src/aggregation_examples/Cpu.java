package aggregation_examples;

public class Cpu {
	public int Id;
	public String brand;
	public String Model;
	public int Price;
	public double speed;
	
	public void printInfo() {
		System.out.println("id : " + Id);
		System.out.println("brand : " + brand);
		System.out.println("model : " + Model);
		System.out.println("price : " + Price);
		System.out.println("weight : " + speed);
	}
}
