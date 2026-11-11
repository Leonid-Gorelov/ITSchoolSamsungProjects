package net;

public class GetChat extends NetworkObject {
    private long peerId;

    public GetChat(long peerId) {
        this.peerId = peerId;
    }

    public long getPeerId() {
        return peerId;
    }
}
