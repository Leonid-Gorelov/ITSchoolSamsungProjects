package net;

public class ChatMessage extends NetworkObject {
    private String message;
    private long senderId;
    private long targetPeerId;
    private long messageId;
    private Attachment[] attachments;
    private long date;

    private static class Attachment {
        private long fileId;
        private String fileType;
        private String fileName;
    }
}
