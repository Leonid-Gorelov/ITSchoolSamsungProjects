package net;

import java.util.ArrayList;

public class Update {
    private ArrayList<NetworkObject> networkObjects;

    public Update(ArrayList<NetworkObject> networkObjects) {
        this.networkObjects = networkObjects;
    }

    public ArrayList<NetworkObject> getNetworkObjects() {
        return networkObjects;
    }

    public void addNetworkObject(NetworkObject networkObject) {
        networkObjects.add(networkObject);
    }

    public void clearNetworkObjects() {
        networkObjects.clear();
    }
}
