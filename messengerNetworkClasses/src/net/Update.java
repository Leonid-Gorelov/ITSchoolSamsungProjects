package net;

public class Update {
    private NetworkObject[] networkObjects;

    public Update(NetworkObject[] networkObjects) {
        this.networkObjects = networkObjects;
    }

    public NetworkObject[] getNetworkObjects() {
        return networkObjects;
    }
}
