// Concrete Colleague
class EastTrafficLight implements ITrafficLight {
    private ITrafficLightController mediator;

    public EastTrafficLight(ITrafficLightController mediator) {
        this.mediator = mediator;
    }

    @Override
    public void changeToGreen() {
        mediator.requestChangeToGreen(this, "East");
    }

    @Override
    public void changeToRed() {
        mediator.requestChangeToRed(this, "East");
    }

    @Override
    public void notifyTrafficControl(String message) {
        System.out.println("East Traffic Light: " + message);
    }
}
