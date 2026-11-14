package net;

public class CreateAccount extends NetworkObject {
    private final String name;
    private final String username;
    private final String sessionToken;

    public CreateAccount(String name, String username, String sessionToken, int version) {
        super(version, "CreateAccount");

        this.name = name;
        this.username = username;
        this.sessionToken = sessionToken;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getSessionToken() {
        return sessionToken;
    }
}
