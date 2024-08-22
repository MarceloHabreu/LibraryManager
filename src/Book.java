public class Book {
    // Attributes
    private String code;
    private String title;
    private String author;
    private Category category;
    private boolean isAvailable;

    // Constructor
    public Book(String code, String title, String author, Category category) {
        this.code = code;
        this.title = title;
        this.author = author;
        this.category = category;
        this.isAvailable = true;
    }

    // Getters and Setters
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Methods
    public String showInfoBook(){
        return "The title is: " + title + ", The author: "+ author + " and your category is: " + category.getName() + ".";
    }

    public boolean updateAvailability(boolean status) {
        this.isAvailable = status;
        return this.isAvailable();
    }

}
