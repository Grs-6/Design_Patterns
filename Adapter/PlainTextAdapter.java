// Adapter Class

public class PlainTextAdapter implements IEbookReader {
    private PlainTextReader plainTextReader;

    public PlainTextAdapter(PlainTextReader plainTextReader) {
        this.plainTextReader = plainTextReader;
    }

    @Override
    public void read(String bookTitle) {
        // Translate the read call to a call to plainTextReader's readBook
        plainTextReader.readBook(bookTitle);
    }
}
