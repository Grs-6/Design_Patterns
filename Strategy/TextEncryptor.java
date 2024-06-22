//context class

public class TextEncryptor {
    private IEncryptionStrategy encryptionStrategy;

    public void setEncryptionStrategy(IEncryptionStrategy encryptionStrategy) {
        this.encryptionStrategy = encryptionStrategy;
    }

    public String encryptText(String text) {
        if (encryptionStrategy == null) {
            throw new IllegalStateException("Encryption strategy not set");
        }
        return encryptionStrategy.encrypt(text);
    }
}
