package net;

public class SetChatList extends NetworkObject {
    private long[] peerIds;
    private String[] displayNames;

    public SetChatList(long[] peerIds, String[] displayNames, int version, String type) {
        super(version, type);

        this.peerIds = peerIds;
        this.displayNames = displayNames;
    }

    public long[] getPeerIds() {
        return peerIds;
    }

    public String[] getDisplayNames() {
        return displayNames;
    }
}
