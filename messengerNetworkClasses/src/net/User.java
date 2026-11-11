package net;

public class User extends NetworkObject {
    private long userId;
    private String sessionToken;

    public User(long userId, String sessionToken, int version, String type) {
        super(version, type);

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
