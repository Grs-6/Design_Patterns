// Concrete Colleague
class EastTrafficLight implements TrafficLight {
    private TrafficLightController mediator;

    public EastTrafficLight(TrafficLightController mediator) {
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
