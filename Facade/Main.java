import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LibraryFacade libraryFacade = new LibraryFacade();
        
        String bookTitle = "Design Patterns";
        String memberId = "M001";
        LocalDate borrowDate = LocalDate.of(2023, 7, 1);
        LocalDate returnDate = LocalDate.of(2023, 8, 5);
        
        libraryFacade.searchBook(bookTitle);
        libraryFacade.borrowBook(bookTitle, memberId, borrowDate);
        libraryFacade.returnBook(bookTitle, memberId, returnDate, borrowDate);

        System.out.println("Total fines: Rs. " + libraryFacade.getTotalFines());
        libraryFacade.payFine(50);
        System.out.println("Remaining fines: Rs. " + libraryFacade.getTotalFines());

        libraryFacade.collectFeesForLostOrDamagedBook(500);
        System.out.println("Total fees collected: Rs. " + libraryFacade.getTotalFeesCollected());
        
        String newBookTitle = "Refactoring";
        LocalDate newBorrowDate = LocalDate.of(2023, 8, 10);
        libraryFacade.borrowBook(newBookTitle, memberId, newBorrowDate); 
        
        libraryFacade.payFine(10);
        
        libraryFacade.borrowBook(newBookTitle, memberId, newBorrowDate);
    }
}
