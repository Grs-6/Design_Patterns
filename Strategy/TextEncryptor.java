//context class

public class TextEncryptor {
    private EncryptionStrategy encryptionStrategy;

    public void setEncryptionStrategy(EncryptionStrategy encryptionStrategy) {
        this.encryptionStrategy = encryptionStrategy;
    }

    public String encryptText(String text) {
        if (encryptionStrategy == null) {
            throw new IllegalStateException("Encryption strategy not set");
        }
        return encryptionStrategy.encrypt(text);
    }
}
