public class WalkingStrategy implements TravelStrategy {
    private static final double AVERAGE_SPEED = 5.0; // Average speed in km/h

    @Override
    public void travel(int distance) {
        double time = distance / AVERAGE_SPEED;
        System.out.println("Traveling by walking:");
        System.out.println("Cost is zero.");
        System.out.println("travel time is " + time + " hours.");
        System.out.println("convenience is low.");

    }
}
