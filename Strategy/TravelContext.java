public class TravelContext {
    private TravelStrategy travelStrategy;

    public TravelContext(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void executeTravel(int distance) {
        travelStrategy.travel(distance);
    }
}
