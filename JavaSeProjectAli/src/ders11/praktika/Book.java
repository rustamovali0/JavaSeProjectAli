package ders11.praktika;

public class Book {

	private String name;
	private String author;
	private int pageCount;
	private double price;
	
	public void setName(String name, String pass) {
		if(pass.equals(Security.getPassword())) {
			this.name=name;
		}
		else {
			System.out.println("Parol Sehvdir");
		}
		
	}
	
	public String getName() {
		return name;
	}

}
