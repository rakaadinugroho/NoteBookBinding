package id.privy.notebinding;

/**
 * Created by Raka on 1/17/18.
 */

public class Book {
    public final String name;
    public final String description;

    public Book(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
