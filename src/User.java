import java.util.ArrayList;
import java.util.List;

public class User {
    //Attributes
    private String name;
    private String address;
    private List<Book> borrowedBooks;

    //Constructor
    public User(String name, String address) {
        this.name = name;
        this.address = address;
        this.borrowedBooks = new ArrayList<>();
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    //Methods
    public void showInfoUser() {
        System.out.println("Name user: " + name + "\n" + "Your address: " + address);
        if (borrowedBooks.isEmpty()){
            System.out.println("No borrowed books");
        } else {
            System.out.println("Borrowed books: ");
            for (Book book : borrowedBooks){
                System.out.println(" - " + book.getTitle());
            }
        }
    }

    public void addBorrowedBook(Book book){
        borrowedBooks.add(book);
    }

    public void removeBorrowedBook(Book book){
        borrowedBooks.remove(book);
    }

}
