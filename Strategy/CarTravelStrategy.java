public class CarTravelStrategy implements TravelStrategy {
    private static final double AVERAGE_SPEED = 60.0; // Average speed in km/h

    @Override
    public void travel(int distance) {
        double time = distance / AVERAGE_SPEED;
        System.out.println("Traveling by car:");
        System.out.println("Cost is moderate.");
        System.out.println("Travel time is " + time + " hours.");
        System.out.println("Convenience is high.");
    }
}
