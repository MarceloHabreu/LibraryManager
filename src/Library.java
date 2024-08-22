import java.util.Collections;
import java.util.List;

public class Library {
    // Attributes
    private String name;
    private String address;
    private List<Book> collection;
    private List<User> users;
    private List<Category> categories;

    // Constructors
    public Library(String name, String address, List<Book> collection, List<User> users, List<Category> categories) {
        this.name = name;
        this.address = address;
        this.collection = collection;
        this.users = users;
        this.categories = categories;
    }

    // Getters and Setters
    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

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

    public List<Book> getCollection() {
        return collection;
    }

    public void setCollection(List<Book> collection) {
        this.collection = collection;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    // Methods
    public void registerBook(Book book){
        this.collection.add(book);
    }

    public String removeBook(String codeBook){
        for (Book book: collection){
            if (book.getCode().equals(codeBook)){
                collection.remove((book));
                return "Book removed successfully.";
            }
        }
        return "Book not found.";
    };
}
