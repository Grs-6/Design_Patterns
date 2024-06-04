import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        TextEncryptor textEncryptor = new TextEncryptor();

        System.out.println("Enter the text to be encrypted:");
        String text = scanner.nextLine();

        if(text==null){
            System.out.println("text not entered");
            // scanner.close();
            return;
        }

        System.out.println("Select encryption type:");
        System.out.println("1. Caesar Cipher Encryption");
        System.out.println("2. ASCII Shift Encryption");
        System.out.println("3. Reverse Encryption");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                textEncryptor.setEncryptionStrategy(new CaesarCipherEncryptionStrategy());
                break;
            case 2:
                textEncryptor.setEncryptionStrategy(new AsciiShiftEncryptionStrategy());
                break;
            case 3:
                textEncryptor.setEncryptionStrategy(new ReverseEncryptionStrategy());
                break;
            default:
                System.out.println("Invalid choice!");
                // scanner.close();
                return;
        }

        String encryptedText = textEncryptor.encryptText(text);
        System.out.println("Encrypted Text: " + encryptedText);
        scanner.close();
    }
}
