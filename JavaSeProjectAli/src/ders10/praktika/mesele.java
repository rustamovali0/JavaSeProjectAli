package ders10.praktika;

public class mesele {
//praktika
	public static void main(String[] args) {

    double uzunlugu=50;
    double versiyiSu=1;
    int kecenGun=0;
    while(uzunlugu<=10000)
    {
    	kecenGun++;
    	uzunlugu+=versiyiSu*5;
    	versiyiSu*=1.5;
    }
		System.out.println(kecenGun);
		

	}

}
