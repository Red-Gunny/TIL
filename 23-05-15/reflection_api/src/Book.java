
public class Book implements BookInterface{

    private String title;

    private static String author;

    private static final String genre = "SF";

    public Book(){};

    public Book(String title) {
        this.title = title;
    }

    public String getPrice() {
        return "20000";
    }
}
