public class Book {

    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static Book of(String author, String title) {
        Book book = new Book(title, author);
        System.out.println("The book's author is " + author + ".");
        System.out.println("The title of the book is " + title + ".");
        return book;
    }
}