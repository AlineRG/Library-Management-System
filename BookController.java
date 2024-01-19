public class BookController {
    private Book model;
    private BookView view;

    public BookController(Book model, BookView view) {
        this.model = model;
        this.view = view;
    }

    // Method to set the book title
    public void setBookTitle(String title) {
        model.setTitle(title);
    }

    // Method to obtain the title of the book
    public String getBookTitle() {
        return model.getTitle();
    }

    // Method to establish the author of the book
    public void setBookAuthor(String author) {
        model.setAuthor(author);
    }

    // Method to update the view with workbook details
    public void updateView() {
        view.printBookDetails(model.getTitle(), model.getAuthor(), model.getISBN());
    }
}
