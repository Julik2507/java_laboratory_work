import exceptions.*;

public class Main {

    public static void main(String[] args) {

        Book myBook1 = new Book("Война и мир", "Лев Толстой");
        Book myBook2 = new Book("Евгений Онегин", "Александр Пушкин");
        Book myBook3 = new Book("Мастер и Маргарита", "Михаил Булгаков");
        Book myBook4 = new Book("Остров Камино", "Джон Гришем");
        Book myBook5 = new Book("Горе от ума", "Александр Грибоедов");
        Book myBook6 = new Book("Обломов", "Иван Гончаров");

        User myUser1 = new User("Данил");
        User myUser2 = new User("Дмитрий");
        User myUser3 = new User("Роман");

        Library myLibrary1 = new Library();

        myLibrary1.addBook(myBook1);
        myLibrary1.addBook(myBook2);
        myLibrary1.addBook(myBook3);
        myLibrary1.addBook(myBook4);
        myLibrary1.addBook(myBook5);
        myLibrary1.addBook(myBook6);
        // myLibrary1.addBook(myBook7);

        myLibrary1.registerUser(myUser1);
        myLibrary1.registerUser(myUser2);
        myLibrary1.registerUser(myUser3);

        try {
            myLibrary1.lendBook("Война и мир", "Данил");
            // myLibrary1.lendBook("Война и мир", "Дмитрий");
            myLibrary1.lendBook("Евгений Онегин", "Данил");
            myLibrary1.lendBook("Мастер и Маргарита", "Данил");
            myLibrary1.lendBook("Остров Камино", "Данил");
            myLibrary1.lendBook("Горе от ума", "Данил");
            // myLibrary1.lendBook("Обломов", "Данил");
            // myLibrary1.lendBook("Обломов", "Данил");
            
        } catch (BookAlreadyBorrowedException | UserNotFoundException | MaxBooksLimitException e) {
            System.out.println(e.getMessage());
        }

        try {
            // myLibrary1.returnBook("Война и мир", "Данил");
            myLibrary1.returnBook("Война и мир", "Роман");
        } catch (BookNotBorrowedException | UserNotFoundException e) {
            System.out.println(e.getMessage());
        }


        // myLibrary1.books.get(0);
        // System.out.println(myLibrary1.books.get(0));
    }

}