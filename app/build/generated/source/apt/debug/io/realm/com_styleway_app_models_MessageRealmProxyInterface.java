package io.realm;


public interface com_styleway_app_models_MessageRealmProxyInterface {
    public String realmGet$senderName();
    public void realmSet$senderName(String value);
    public String realmGet$senderImage();
    public void realmSet$senderImage(String value);
    public String realmGet$senderStatus();
    public void realmSet$senderStatus(String value);
    public String realmGet$recipientName();
    public void realmSet$recipientName(String value);
    public String realmGet$recipientImage();
    public void realmSet$recipientImage(String value);
    public String realmGet$recipientStatus();
    public void realmSet$recipientStatus(String value);
    public String realmGet$body();
    public void realmSet$body(String value);
    public String realmGet$id();
    public void realmSet$id(String value);
    public String realmGet$recipientId();
    public void realmSet$recipientId(String value);
    public String realmGet$senderId();
    public void realmSet$senderId(String value);
    public RealmList<com.styleway.app.models.MyString> realmGet$recipientGroupIds();
    public void realmSet$recipientGroupIds(RealmList<com.styleway.app.models.MyString> value);
    public long realmGet$date();
    public void realmSet$date(long value);
    public boolean realmGet$delivered();
    public void realmSet$delivered(boolean value);
    public boolean realmGet$sent();
    public void realmSet$sent(boolean value);
    public int realmGet$attachmentType();
    public void realmSet$attachmentType(int value);
    public com.styleway.app.models.Attachment realmGet$attachment();
    public void realmSet$attachment(com.styleway.app.models.Attachment value);
}
