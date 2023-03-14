package shopping;

public class MainClass {
	public static void main(String[] args) {

		Product alma = new Product();
		alma.name = "Quba almasi";
		alma.price = 12.7;
		
		Product armud = new Product();
		armud.name = "Armud";
		armud.price = 3.7;
		
		Product heyva = new Product();
		heyva.name = "Heyva";
		heyva.price = 2.5;
		
		Product ciyelek = new Product();
		ciyelek.name = "Ciyelek";
		ciyelek.price = 200.3;
		
		Product alca = new Product();
		alca.name = "Alca";
		alca.price = 196.7;

		Bank access = new Bank();
		access.balance = 500;
		shopping myshopping = new shopping();
		access.showBalance();
		System.out.println("*******************");
		myshopping.shop(access, alma, 0.65);
		System.out.println("Alma");
		access.showBalance();
		System.out.println("*-*-*-*-*-*-*-*-*-*");
		myshopping.shop(access, armud, 0.21);
		System.out.println("Armud");
		access.showBalance();
		System.out.println("*-*-*-*-*-*-*-*-*-*");
		myshopping.shop(access, alca, 0.10);
		System.out.println("Alca");
		access.showBalance();
		System.out.println("*-*-*-*-*-*-*-*-*-*");
		myshopping.shop(access, heyva, 0.45);
		System.out.println("Heyva");
		access.showBalance();
		System.out.println("*-*-*-*-*-*-*-*-*-*");
		myshopping.shop(access, ciyelek, 0.98);
		System.out.println("Ciyelek");
		access.showBalance();
		System.out.println("*******************");
	}
}
