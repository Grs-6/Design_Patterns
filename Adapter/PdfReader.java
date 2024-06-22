public class PdfReader implements IEbookReader {
    @Override
    public void read(String bookTitle) {
        System.out.println("Reading Pdf book: " + bookTitle);
    }
}
