package shopping;

public class Bank {
	double balance;
    public void drawmoney(double amount) {
		balance-=amount;
		
		
	}
    public void showBalance() {
		System.out.println("Cari balans "+balance);
	}
}
