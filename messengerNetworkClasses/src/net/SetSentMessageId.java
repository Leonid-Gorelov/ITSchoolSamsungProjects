package net;

public class SetSentMessageId extends NetworkObject {
    private int tempMessageId;
    private long messageId;

    public SetSentMessageId(int tempMessageId, long messageId, int version, String type) {
        super(version, type);

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
