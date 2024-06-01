public class CyclingStrategy implements TravelStrategy {
    private static final double AVERAGE_SPEED = 15.0; // Average speed in km/h

    @Override
    public void travel(int distance) {
        double time = distance / AVERAGE_SPEED;
        System.out.println("Traveling by bicycle:");
        System.out.println("Cost is low.");
        System.out.println("Travel time is " + time + " hours.");
        System.out.println("Convenience is medium.");
    }
}
