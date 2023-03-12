package shopping;

public class shopping {
void shop(Bank b,Product p, double q) {
	double totalAmount=p.price*q;
	b.drawmoney(totalAmount);
	
}
}
