package net;

public class MarkAsRead extends NetworkObject {
    private long messageId;

    public MarkAsRead(long messageId, int version, String type) {
        super(version, type);

        this.messageId = messageId;
    }

    public long getMessageId() {
        return messageId;
    }
}
