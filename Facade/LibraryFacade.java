import java.time.LocalDate;

public class LibraryFacade {
    private BookCatalog bookCatalog;
    private BorrowReturnService borrowReturnService;
    private FeesService feesService;

    public LibraryFacade() {
        this.bookCatalog = new BookCatalog();
        this.borrowReturnService = new BorrowReturnService();
        this.feesService = new FeesService();
    }

    public void searchBook(String title) {
        bookCatalog.searchBook(title);
        bookCatalog.checkBookAvailability(title);
    }

    public void borrowBook(String title, String memberId, LocalDate borrowDate) {
        if (feesService.hasOutstandingFines()) {
            System.out.println("Cannot borrow book. Outstanding fines exist.");
        } else {
            bookCatalog.checkBookAvailability(title);
            borrowReturnService.borrowBook(title, memberId, borrowDate);
        }
    }

    public void returnBook(String title, String memberId, LocalDate returnDate, LocalDate borrowDate) {
        long fine = borrowReturnService.returnBook(title, memberId, returnDate, borrowDate);
        if (fine > 0) {
            feesService.storeFine(fine);
        }
    }

    public void collectFeesForLostOrDamagedBook(long amount) {
        feesService.collectLostOrDamageFees(amount);
    }

    public long getTotalFeesCollected() {
        return feesService.getTotalFeesCollected();
    }

    public long getTotalFines() {
        return feesService.getTotalFines();
    }

    public void payFine(long amount) {
        feesService.payFine(amount);
    }
}
