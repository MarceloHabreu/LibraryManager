import java.util.ArrayList;
import java.util.List;

public class Category {
    // Attributes
    private String name;
    private String description;
    private List<Book> books;

    // Constructor
    public Category(String name, String description) {
        this.name = name;
        this.description = description;
        this.books = new ArrayList<>();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Methods
    public String showInfoCategory(){
        return "Category: " + name + ", description: " + description;
    }

    public String listBooks() {
        if (books.isEmpty()) {
            return "No books available in this category";
        }
        StringBuilder bookList = new StringBuilder(); // Create a "cadeia de caracteres" that ca be changeable "mutável"
        for (Book book : books) {
            bookList.append(book.showInfoBook()).append(("\n"));
        }
        return bookList.toString();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public String removeBook(Book book) {
        if(books.remove(book)){
            return "Book removed successfully of category.";
        }
        else {
            return "Book not found.";
        }
    }
}
