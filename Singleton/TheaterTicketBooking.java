public class TheaterTicketBooking {

    private static TheaterTicketBooking instance;
    private int availableSeats;
    private int firstClassSeats;
    private int secondClassSeats;
    private int premiumSeats;

    private TheaterTicketBooking(int seats) {
        this.availableSeats = seats;
        this.firstClassSeats = (int) (seats * 0.30);
        this.secondClassSeats = (int) (seats * 0.50);
        this.premiumSeats = (int) (seats * 0.20);

    }

    public static synchronized TheaterTicketBooking getInstance() {
        if (instance == null) {
            instance = new TheaterTicketBooking(100);
        }
        return instance;
    }

    public synchronized boolean bookTickets(int numberOfTickets, String ticketType) {
        int availableSeatsForType = 0;
        switch (ticketType) {
            case "first_class":
                availableSeatsForType = firstClassSeats;
                break;
            case "second_class":
                availableSeatsForType = secondClassSeats;
                break;
            case "premium":
                availableSeatsForType = premiumSeats;
                break;
            default:
                System.out.println("Invalid ticket type.");
                return false;
        }
    
        if (numberOfTickets <= availableSeatsForType) {
            switch (ticketType) {
                case "first_class":
                    firstClassSeats -= numberOfTickets;
                    break;
                case "second_class":
                    secondClassSeats -= numberOfTickets;
                    break;
                case "premium":
                    premiumSeats -= numberOfTickets;
                    break;
            }
            availableSeats-=numberOfTickets;

            System.out.println("Successfully booked " + numberOfTickets + " " + ticketType + " tickets.\n");
            return true;
        } else {
            System.out.println("Failed to book tickets. Only " + availableSeatsForType + " " + ticketType + " seats remaining.\n");
            return false;
        }
    }
    

    public void displayAvailableSeats() {
        System.out.println("Available: " + availableSeats );
        System.out.println("First class seats: " + firstClassSeats );
        System.out.println("Second class seats: " + secondClassSeats );
        System.out.println("Premium seats: " + premiumSeats);
        System.out.println("\n\n ");


    }
}