// import java.util.Scanner;

public class Book {

    public String title, author;
    private boolean isBorrowed=false;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void borrow() {
        this.isBorrowed = true;
    }

    public void returnBook() {
        this.isBorrowed = false;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isBorrowed() {
        return this.isBorrowed;
    }

}