package net;

public class User extends NetworkObject {
    private final long userId;
    private final String sessionToken;

    public User(long userId, String sessionToken, int version) {
        super(version, "User");

        this.userId = userId;
        this.sessionToken = sessionToken;
    }

    public long getUserId() {
        return userId;
    }

    public String getSessionToken() {
        return sessionToken;
    }
}
