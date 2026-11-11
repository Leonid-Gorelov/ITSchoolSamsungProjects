package net;

public class User extends NetworkObject {
    private long userId;
    private String sessionToken;

    public User(long userId, String sessionToken) {
        this.userId = userId;
        this.sessionToken = sessionToken;
    }
}
