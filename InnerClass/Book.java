package InnerClass;

public class Book {
	static String book = "ROCCO";

	public static class Title {
		static String title = "THE HUNTER";

	}

	public static void main(String[] args) {
	//	Book book = new Book();
		System.out.println(Book.book);
		System.out.println(Title.title);
	}

}
