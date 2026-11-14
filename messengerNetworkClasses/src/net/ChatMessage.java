package net;

public class ChatMessage extends NetworkObject {
    private final String text;
    private final long senderId;
    private final long targetPeerId;
    private final long messageId;
    private final Attachment[] attachments;
    private final long date;

    public ChatMessage(String text, long senderId, long targetPeerId, long messageId, Attachment[] attachments, long date, int version) {
        super(version, "ChatMessage");

        this.text = text;
        this.senderId = senderId;
        this.targetPeerId = targetPeerId;
        this.messageId = messageId;
        this.attachments = attachments;
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public long getSenderId() {
        return senderId;
    }

    public long getTargetPeerId() {
        return targetPeerId;
    }

    public long getMessageId() {
        return messageId;
    }

    public Attachment[] getAttachments() {
        return attachments;
    }

    public long getDate() {
        return date;
    }

    public static class Attachment {
        private long fileId;
        private String fileName;
        private String fileType;

        public Attachment(long fileId, String fileName, String fileType) {
            this.fileId = fileId;
            this.fileName = fileName;
            this.fileType = fileType;
        }

        public long getFileId() {
            return fileId;
        }

        public String getFileName() {
            return fileName;
        }

        public String getFileType() {
            return fileType;
        }
    }
}
