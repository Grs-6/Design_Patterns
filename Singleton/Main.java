public class Main {
    public static void main(String[] args) {

        TheaterTicketBooking booking1 = TheaterTicketBooking.getInstance();
        booking1.displayAvailableSeats();

        booking1.bookTickets(2,"first_class");
        booking1.bookTickets(1,"premium");

        booking1.displayAvailableSeats();

        TheaterTicketBooking booking2 = TheaterTicketBooking.getInstance();
        booking2.bookTickets(3,"second_class");

        booking1.displayAvailableSeats();
    }
    
}

