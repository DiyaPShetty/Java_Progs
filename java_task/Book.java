package library;
//class book
public class Book {
    private String id;
    private String title;
    private String author;
    private boolean issued;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.issued = false;
    }
//getter methods
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return issued;
    }

    public void issue() {
        this.issued = true;
    }

    public void returnBook() {
        this.issued = false;
    }
//override
    @Override
    public String toString() {
        return "[" + id + "] " + title + " by " + author + (issued ? " (Issued)" : " (Available)");
    }
}
