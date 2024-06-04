//concrete startegy 3

public class AsciiShiftEncryptionStrategy implements EncryptionStrategy {
    @Override
    public String encrypt(String text) {
        String result = "";
        char[] charArray=text.toCharArray();
        for (int i=0;i<charArray.length;i++) {
            result += (char) (charArray[i] + 1);
        }
        return result;
    }
}
