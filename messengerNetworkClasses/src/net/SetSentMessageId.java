package net;

public class SetSentMessageId extends NetworkObject {
    private final int tempMessageId;
    private final long messageId;

    public SetSentMessageId(int tempMessageId, long messageId, int version) {
        super(version, "SetSentMessageId");

        this.tempMessageId = tempMessageId;
        this.messageId = messageId;
    }

    public int getTempMessageId() {
        return tempMessageId;
    }

    public long getMessageId() {
        return messageId;
    }
}
