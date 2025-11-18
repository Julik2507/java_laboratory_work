import java.util.ArrayList;

public class User {
    
    private String name;
    private ArrayList<Book> borrowedBooks = new ArrayList<Book>();

    public User(String name) {
        this.name = name;
    }

    public void borrowBook(Book book) {
        
        this.borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        this.borrowedBooks.remove(book);
    }

    public String getName() {
        return this.name;
    }

    public boolean findBook(String title) {
        for(Book borrowedBook : borrowedBooks) {
            if(borrowedBook.getTitle() == title) {
                return true;
            }
        }
        return false;
    }

    public int getQuantityBooks() {
        return borrowedBooks.size();
    }

}