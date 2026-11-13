package net;

public class NetworkObject {
    private int version;
    private String type;

    public NetworkObject(int version, String type) {
        this.version = version;
        this.type = type;
    }

    public int getVersion() {
        return version;
    }

    public String getType() {
        return type;
    }
}
