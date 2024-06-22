// Mediator Interface
interface ITrafficLightController {
    void requestChangeToGreen(ITrafficLight trafficLight, String direction);
    void requestChangeToRed(ITrafficLight trafficLight, String direction);
}
