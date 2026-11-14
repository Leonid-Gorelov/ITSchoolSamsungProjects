package net;

public class GetLogInResult extends NetworkObject {
    private final String sessionToken;
    private final int resultCode;

    public GetLogInResult(String sessionToken, int resultCode, int version) {
        super(version, "GetLogInResult");

        this.sessionToken = sessionToken;
        this.resultCode = resultCode;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public int getResultCode() {
        return resultCode;
    }
}
