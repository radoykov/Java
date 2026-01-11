package bank;

import java.io.Serializable;
import java.util.UUID;

/*
 Represents a user in the banking system.
 Stores a unique ID, username, and a hashed password.
 */
public class User implements Serializable {
    private String id;
    private String username;
    private int passwordHash;

    public User(String username, String password) {
        this.id = UUID.randomUUID().toString();
        this.username = username;
        this.passwordHash = password.hashCode();
    }

    public String getId() { return id; }
    public String getUsername() { return username; }

    public boolean checkPassword(String password) {
        return passwordHash == password.hashCode();
    }
}
