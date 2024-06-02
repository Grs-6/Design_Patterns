// Mediator Interface
interface TrafficLightController {
    void requestChangeToGreen(TrafficLight trafficLight, String direction);
    void requestChangeToRed(TrafficLight trafficLight, String direction);
}
