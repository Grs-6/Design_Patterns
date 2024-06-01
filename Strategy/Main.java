import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get distance
        System.out.print("Enter the distance to travel (in kilometers): ");
        int distance = scanner.nextInt();

        // Get travel strategy
        System.out.println("Select a travel strategy:");
        System.out.println("1. Walking");
        System.out.println("2. Bicycle");
        System.out.println("3. Car");
        int choice = scanner.nextInt();

        TravelStrategy strategy;
        switch (choice) {
            case 1:
                strategy = new WalkingStrategy();
                break;
            case 2:
                strategy = new CyclingStrategy();
                break;
            case 3:
                strategy = new CarTravelStrategy();
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Car travel.");
                strategy = new CarTravelStrategy();
                break;
        }

        // Create context with the selected strategy
        TravelContext context = new TravelContext(strategy);

        context.executeTravel(distance);

        scanner.close();
    }
}
