package aggregation_examples;

public class Main {
public static void main(String[] args) {
	
	Computer dell = new Computer();
	dell.brand="Dell";
	dell.model="Inspiron 15 3521";
	dell.price=1000;
	dell.id=1;
	dell.weight=3;
	
	Ram ram=new Ram();
	ram.Brand="Hitaci";
	ram.Model="g44";
	ram.Size=24;
	ram.Id=4;
	ram.Price=80;
	dell.ram=ram;
	
	Cpu cpu = new Cpu();
	cpu.Id=3;
	cpu.Model="Core i5 6500";
	cpu.brand="Intel";
	cpu.Price=200;
	cpu.speed=3.5;
	dell.cpu=cpu;
	
	dell.printInfo();
}
}
