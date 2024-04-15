import java.util.UUID;

public class UserDao {
    private static final User[] users;

    static {
        users = new User[]{
                new User(UUID.randomUUID().toString(), "Jim"),
                new User(UUID.randomUUID().toString(), "Jamila"),
        };

    }

        public User[] getUser(){
            return users;
        }

    }

