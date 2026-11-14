package net;

public class GetChat extends NetworkObject {
    private final long peerId;

    public GetChat(long peerId, int version) {
        super(version, "GetChat");

        this.peerId = peerId;
    }

    public long getPeerId() {
        return peerId;
    }
}
