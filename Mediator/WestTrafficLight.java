// Concrete Colleague
class WestTrafficLight implements ITrafficLight {
    private ITrafficLightController mediator;

    public WestTrafficLight(ITrafficLightController mediator) {
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