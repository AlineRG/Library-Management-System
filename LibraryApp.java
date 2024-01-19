public class LibraryApp {
    public static void main(String[] args) {
        Book model = retrieveBookFromDatabase();
        BookView view = new BookView();

        BookController controller = new BookController(model, view);

        controller.updateView();

        controller.setBookTitle("New Title");
        controller.setBookAuthor("New Author");
        System.out.println("\nBook Details after updating: ");

        controller.updateView();
    }

    private static Book retrieveBookFromDatabase() {
        Book book = new Book();
        book.setTitle("An Example Book");
        book.setAuthor("John Doe");
        book.setISBN("1234567890");
        return book;
    }
}

