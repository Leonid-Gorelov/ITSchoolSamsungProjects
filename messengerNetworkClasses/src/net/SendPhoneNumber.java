package net;

public class SendPhoneNumber extends NetworkObject {
    private final String phoneNumber;

    public SendPhoneNumber(String phoneNumber, int version) {
        super(version, "SendPhoneNumber");

        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
