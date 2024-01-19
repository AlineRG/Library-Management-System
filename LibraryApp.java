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
        book.setTitle("Robinson Crusoe");
        book.setAuthor("Daniel Defoe");
        book.setISBN("9780194229845");
        return book;
    }
}

