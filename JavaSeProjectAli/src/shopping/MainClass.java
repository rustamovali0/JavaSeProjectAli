package shopping;

public class MainClass {
	public static void main(String[] args) {

		Product alma = new Product();
		alma.name = "Quba almasi";
		alma.price = 12.7;

		Product alca = new Product();
		alca.name = "Quba almasi";
		alca.price = 96.7;

		Bank access = new Bank();
		access.balance = 10;
		shopping myshopping = new shopping();
		access.showBalance();
		myshopping.shop(access, alca, 0.1);
		access.showBalance();
	}
}
