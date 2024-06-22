// Concrete Colleague
class SouthTrafficLight implements ITrafficLight {
    private ITrafficLightController mediator;

    public SouthTrafficLight(ITrafficLightController mediator) {
        this.mediator = mediator;
    }

    @Override
    public void changeToGreen() {
        mediator.requestChangeToGreen(this, "South");
    }

    @Override
    public void changeToRed() {
        mediator.requestChangeToRed(this, "South");
    }

    @Override
    public void notifyTrafficControl(String message) {
        System.out.println("South Traffic Light: " + message);
    }
}

