package net;

public class MarkAsRead extends NetworkObject {
    private final long messageId;

    public MarkAsRead(long messageId, int version) {
        super(version, "MarkAsRead");

        this.messageId = messageId;
    }

    public long getMessageId() {
        return messageId;
    }
}
