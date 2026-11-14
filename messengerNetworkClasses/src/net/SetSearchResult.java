package net;

public class SetSearchResult extends NetworkObject {
    private final long peerId;

    public SetSearchResult(long peerId, int version) {
        super(version, "SetSearchResult");

        this.peerId = peerId;
    }

    public long getPeerId() {
        return peerId;
    }
}
