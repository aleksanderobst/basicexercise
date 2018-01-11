package gdynia;

public class Book {

    private String title;
    private String isbn;
    private int price;
    private Author author;


    public Book(String title, String isbn, int price, String author) {
        this.title = title;
        this.isbn = isbn;
        this.price = price;

    }


    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPrice() {
        return price;
    }
}
