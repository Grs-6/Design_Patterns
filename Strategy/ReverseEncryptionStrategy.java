//concrete strategy 1

public class ReverseEncryptionStrategy implements EncryptionStrategy {
    @Override
    public String encrypt(String text) {
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }
        return result;
    }
}
