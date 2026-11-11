package net;

public class MarkAsRead extends NetworkObject {
    private long messageId;

    public MarkAsRead(long messageId) {
        this.messageId = messageId;
    }

    public long getMessageId() {
        return messageId;
    }
}
