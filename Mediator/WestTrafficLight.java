// Concrete Colleague
class WestTrafficLight implements TrafficLight {
    private TrafficLightController mediator;

    public WestTrafficLight(TrafficLightController mediator) {
        this.mediator = mediator;
    }

    @Override
    public void changeToGreen() {
        mediator.requestChangeToGreen(this, "West");
    }

    @Override
    public void changeToRed() {
        mediator.requestChangeToRed(this, "West");
    }

    @Override
    public void notifyTrafficControl(String message) {
        System.out.println("West Traffic Light: " + message);
    }
}