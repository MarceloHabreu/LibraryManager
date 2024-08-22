import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating Categories
        Category dystopia = new Category("Dystopia", "Dystopia books");
        Category science = new Category("Science", "Science books");
        Category fantasy = new Category("Fantasy", "Fantasy books");

        // Creating books
        Book book1 = new Book("01", "1984", "George Orwell", dystopia);
        Book book2 = new Book("02", "A Brief History of Time", "Stephen Hawking", science);
        Book book4 = new Book("04", "Hunger Games", "Suzanne Collins", dystopia);

        // Creating Users
        User user1 = new User("Marcelo", "1012 Main St");
        User user2 = new User("Alice", "141 Elm St");

        // Adding books borrowed to users
        user1.addBorrowedBook(book1);
        user2.addBorrowedBook(book2);

        // Creating a list of books and users for the library
        List<Book> bookCollection = new ArrayList<>();
        bookCollection.add(book1);
        bookCollection.add(book2);

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);

        // Creating Category List
        List<Category> categories = new ArrayList<>();
        categories.add(dystopia);
        categories.add(science);

        // Creating the Library
        Library library = new Library("Seu Jão's Library", "789 Maple St", bookCollection, users, categories);
        System.out.println("Library: " + library.getName() + " and your address: " + library.getAddress());

        // Testing Registration and Book Removal
        System.out.println("Your Collection:");
        for (Book book : library.getCollection()) {
            System.out.println(book.showInfoBook());
        }
        // Adding new book
        System.out.println("---------Add new Book---------");
        Book book3 = new Book("03", "Alice in Wonderland", "Lewis Carroll", fantasy);
        library.registerBook(book3);
        for (Book book : library.getCollection()) {
            System.out.println(book.showInfoBook());
        }
        // Removing book
        library.removeBook("01");
        System.out.println("---------Removing book 1984---------");
        for (Book book : library.getCollection()) {
            System.out.println(book.showInfoBook());
        }
        // Info user
        System.out.println("---------Info user1---------");
        user1.showInfoUser();
        System.out.println("---------Info user2---------");
        user2.showInfoUser();
        user2.addBorrowedBook(book3);
        System.out.println("---------Adding borrowed book to user2---------");
        user2.showInfoUser();
        System.out.println("---------Removing borrowed book of user2---------");
        user2.removeBorrowedBook(book2);
        user2.showInfoUser();

        // Listing books in a category
        System.out.println("---------Listing books of category dystopia---------");
        System.out.println(science.listBooks());

        // Testing a loan status update
        System.out.println("---------Status borrowed books---------");
        List<Book> borrowedBooks = new ArrayList<>();
        borrowedBooks.add(book2);
        Loan loan = new Loan(borrowedBooks,user2, "Pending");
        loan.showDetailsLoan();
        loan.updateStatus("Completed");
        loan.showDetailsLoan();
    }
}
