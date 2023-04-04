package ders11.varislik;

public class Car {
String model;
double price;
int currentspeed =0;

public Car() {
	System.out.println("Car object created");
}

public void startEngine() {
	currentspeed=10;
}

}
