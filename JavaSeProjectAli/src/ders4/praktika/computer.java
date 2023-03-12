package ders4.praktika;

public class computer {
    int price;
	String brand;
	String model;
	String color;
	double weight;
	int ramSize;
	boolean started;
	
	public void printcomputerinfo() {
		System.out.println("qiymet = "+price);
		System.out.println("marka = "+brand);
        System.out.println("model = "+model);
        System.out.println("reng = "+color);
        System.out.println("ceki = "+weight);
        System.out.println("ram= "+ramSize);
        System.out.println("Isleyir= "+started);
	}
	public void start() { //metod
		started=true;
	}
	
public void restart() { 
	started=true;
	started=false;
	}
public void shutDown() { 
	started=false;
}
} 