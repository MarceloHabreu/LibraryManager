import java.util.List;

public class Loan {
    // Attributes
    private List<Book> books;
    private User user;
    private String status;

    // Constructor
    public Loan(List<Book> books, User user, String status) {
        this.books = books;
        this.user = user;
        this.status = status;
    }

    // Getters and Setters
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Methods
    public void showDetailsLoan() {
        if (books.isEmpty()) {
            System.out.println("No books were borrowed.");
        } else {
            System.out.println("Books borrowed by " + user.getName() + ":");
            for (Book book : books) {
                System.out.println(" - " + book.showInfoBook());
            }
        }
        System.out.println("Loan status: " + status);
    }

    public void updateStatus(String newStatus) {
        if (newStatus == null || newStatus.isEmpty()) {
            System.out.println("Status not updated or Invalid.");
        } else {
            this.status = newStatus;
            System.out.println("Loan status updated to: " + status);
        }
    }
}
