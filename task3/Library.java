import java.util.ArrayList;
import exceptions.*;

public class Library {

    public ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<User> users = new ArrayList<User>();

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void registerUser(User user) {
        this.users.add(user);
    }

    public void lendBook(String bookTitle, String userName) throws BookAlreadyBorrowedException, UserNotFoundException, MaxBooksLimitException {
        
        boolean userFound = false;

        for(Book book : books) {
            if(book.getTitle() == bookTitle) {

                if(!book.isBorrowed()) {

                    for(User user : users) {
                        if(user.getName() == userName) {
                            userFound = true;

                            if(user.getQuantityBooks() < 5) {
                                // System.out.println(user.getQuantityBooks());
                                user.borrowBook(book);
                                book.borrow();
                                
                                break;

                            } else {
                                throw new MaxBooksLimitException("В одни руки 5 книг максимум!");
                            }

                        }
                    }

                    if(!userFound) throw new UserNotFoundException("Пользователя не существует!");           
 
                } else {
                    throw new BookAlreadyBorrowedException("Книга уже взята!");
                }
            
                break;
            }
        }
    }

    public void returnBook(String bookTitle, String userName) throws BookNotBorrowedException, UserNotFoundException {
            
        boolean userFound = false;

        for(User user : users) {
            // System.out.println(user.getName());
            if(user.getName() == userName) {

                userFound = true;

                if(user.findBook(bookTitle)) {

                    for(Book book : books) {
                        if(book.getTitle() == bookTitle) {
                            
                            user.returnBook(book);
                            book.returnBook();

                            break;

                        }
                    }
                    
                } else {
                    throw new BookNotBorrowedException("Книгу не взяли!");
                }

                break;
            }
        }
        if(!userFound) throw new UserNotFoundException("Пользователя не существует!");           
    }


}

//Если пользователь не найден — выбросить UserNotFoundException.
//Если книга не найдена — выбросить BookNotFoundException.
