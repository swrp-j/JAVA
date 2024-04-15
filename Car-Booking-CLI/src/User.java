import java.util.UUID;

public class User {
    //user has three parameters - Id, name,has booked?
    String name;
    boolean hasBooked;
    String uniqueId;

    public User(String name, String uniqueId) {
        this.name = name;
        this.uniqueId = uniqueId;
    }

    public User(boolean hasBooked) {
        this.hasBooked = hasBooked;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", uniqueId='" + uniqueId + '\'' +
                '}';
    }
}
