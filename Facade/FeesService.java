public class FeesService {
    private long totalFeesCollected = 0;
    private long totalFines = 0;

    public void storeFine(long fine) {
        totalFines += fine;
        System.out.println("Stored fine: Rs. " + fine);
    }

    public long getTotalFines() {
        return totalFines;
    }

    public boolean hasOutstandingFines() {
        return totalFines > 0;
    }

    public void payFine(long amount) {
        if (amount <= totalFines) {
            totalFines -= amount;
            totalFeesCollected += amount;
            System.out.println("Paid fine: Rs. " + amount);
        } else {
            System.out.println("Payment exceeds total fines. Fine not paid.");
        }
    }

    public void collectLostOrDamageFees(long amount) {
        totalFeesCollected += amount;
        System.out.println("Collected fees for lost or damaged book: Rs. " + amount);
    }

    public long getTotalFeesCollected() {
        return totalFeesCollected;
    }
}
