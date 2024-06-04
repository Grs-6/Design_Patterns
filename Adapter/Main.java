public class Main {
    public static void main(String[] args) {
        // Create a modern EPUB reader
        EbookReader epubReader = new PdfReader();

        // Create a legacy e-book reader
        PlainTextReader plainTextReader = new PlainTextReader();

        // Create an adapter for the legacy reader
        EbookReader plainTextFormatAdapter = new PlainTextAdapter(plainTextReader);

        // Use the modern EPUB reader
        epubReader.read("The Great Gatsby");

        // Use the legacy reader through the adapter
        plainTextFormatAdapter.read("Moby Dick");
    }
}
