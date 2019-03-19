package SpringJavaNewer.model;

import java.util.Arrays;
import java.util.List;
public class Book {
    private int id;
    private String name;
    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public static List<Book> getAllBooks() {
        return Arrays.asList(
                new Book(100, "Java Tutorials"),
                new Book(200, "Spring Tutorials"),
                new Book(300, "Angular Tutorials")
        );
    }
}
