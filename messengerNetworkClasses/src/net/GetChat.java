package net;

public class GetChat extends NetworkObject {
    private long peerId;

    public GetChat(long peerId, int version, String type) {
        super(version, type);

        this.peerId = peerId;
    }

    public long getPeerId() {
        return peerId;
    }
}
