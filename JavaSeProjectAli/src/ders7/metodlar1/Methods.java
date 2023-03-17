package ders7.metodlar1;

public class Methods {
	public static void main(String[] args) {
     Methods m=new Methods();
     m.printName(4, "Adil");
	}

void printName(int count, String name) {
	for(int i=0;i<count;i++) {
		System.out.println(name);
	}
}

}
 