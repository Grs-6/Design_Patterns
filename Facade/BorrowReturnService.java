import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BorrowReturnService {
    private static final int MAX_BORROW_DAYS = 30;
    private static final int FINE_PER_DAY = 2;

    public void borrowBook(String title, String memberId, LocalDate borrowDate) {
        System.out.println("Borrowing book: " + title + " for member: " + memberId + " on " + borrowDate);
    }

    public long returnBook(String title, String memberId, LocalDate returnDate, LocalDate borrowDate) {
        System.out.println("Returning book: " + title + " from member: " + memberId + " on " + returnDate);
        long daysBetween = ChronoUnit.DAYS.between(borrowDate, returnDate);
        if (daysBetween > MAX_BORROW_DAYS) {
            long overdueDays = daysBetween - MAX_BORROW_DAYS;
            long fine = overdueDays * FINE_PER_DAY;
            System.out.println("Book is overdue by " + overdueDays + " days. Fine: Rs. " + fine);
            return fine;
        }
        return 0;
    }
}
