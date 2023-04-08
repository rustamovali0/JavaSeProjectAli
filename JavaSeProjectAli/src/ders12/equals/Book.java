package ders12.equals;

public class Book {

	public Book() {
		System.out.println("Bazani ac");
		
	}
	@Override
	protected void finalize() throws Throwable {

		System.out.println("book-un son sozu");
		System.out.println("Bazani bagla");
	}

}
