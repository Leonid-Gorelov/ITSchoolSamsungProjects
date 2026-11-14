package net;

public class SendSmsCode extends NetworkObject {
    private final int smsCode;

    public SendSmsCode(int smsCode, int version, String type) {
        super(version, "SendSmsCode");

        this.smsCode = smsCode;
    }

    public int getSmsCode() {
        return smsCode;
    }
}
