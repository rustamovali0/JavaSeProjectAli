package ders4.praktika;

public class mainclass {
public static void main(String[] args) {
	
		 computer dell = new computer();
	     dell.brand="Dell";
	     dell.model="inspiron 15";
	     dell.price=300;
	     dell.color="blue";
	     dell.weight=2.3;
	     dell.ramSize=8;
	     
         dell.printcomputerinfo();
         System.out.println("===================");
         computer acer=new computer();
         acer.model="Nitro 7";
         acer.price=3000;
         acer.start();
         acer.printcomputerinfo();
         System.out.println("--------------------");
         acer.shutDown();
         acer.printcomputerinfo();
       
         
	}

}
