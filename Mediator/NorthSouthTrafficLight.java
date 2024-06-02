// Concrete Colleague
class NorthTrafficLight implements TrafficLight {
    private TrafficLightController mediator;

    public NorthTrafficLight(TrafficLightController mediator) {
        this.mediator = mediator;
    }

    @Override
    public void changeToGreen() {
        mediator.requestChangeToGreen(this, "North");
    }

    @Override
    public void changeToRed() {
        mediator.requestChangeToRed(this, "North");
    }

    @Override
    public void notifyTrafficControl(String message) {
        System.out.println("North Traffic Light: " + message);
    }
}