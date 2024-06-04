public class PdfReader implements EbookReader {
    @Override
    public void read(String bookTitle) {
        System.out.println("Reading Pdf book: " + bookTitle);
    }
}
