public class CaesarCipherEncryptionStrategy implements EncryptionStrategy {
    private static final int SHIFT = 3;

    @Override
    public String encrypt(String text) {
        StringBuilder result = new StringBuilder();
        char[] charArray = text.toCharArray();
        
        // Iterate over each character in the input text using a normal for-loop
        for (int i = 0; i < charArray.length; i++) {
            char character = charArray[i];
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                result.append((char) ((character - base + SHIFT) % 26 + base));
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }
}
