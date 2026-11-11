package net;

public class ChatMessage extends NetworkObject {
    private String text;
    private long senderId;
    private long targetPeerId;
    private long messageId;
    private Attachment[] attachments;
    private long date;

    public ChatMessage(String text, long senderId, long targetPeerId, long messageId, Attachment[] attachments, long date, int version, String type) {
        super(version, type);

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
