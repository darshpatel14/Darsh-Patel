package homework;

public class BookDemo {

	public static void main(String[] args) {

		Author author = new Author("Darsh", "Patel");
		Book book = new Book("Software Development", author, 399.99);
		System.out.println(book);
	}

}
