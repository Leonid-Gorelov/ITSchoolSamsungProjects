package net;

public class SetChatList extends NetworkObject {
    private final long[] peerIds;
    private final String[] displayNames;

    public SetChatList(long[] peerIds, String[] displayNames, int version) {
        super(version, "SetChatList");

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
