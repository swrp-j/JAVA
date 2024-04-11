import java.util.UUID;

public class User {
    //user has three parameters - Id, name,has booked?
    String name;
    boolean hasBooked;
    UUID uuid = UUID.randomUUID();
    String uniqueId = uuid.toString();


    public User(String name, boolean hasBooked) {
        this.name = name;
        this.hasBooked = hasBooked;
    }

    public User(String name) {
        this.name = name;
    }
}
