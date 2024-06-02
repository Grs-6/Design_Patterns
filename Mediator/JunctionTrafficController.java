import java.util.HashMap;
import java.util.Map;

// Concrete Mediator
class JunctionTrafficController implements TrafficLightController {
    private Map<String, TrafficLight> trafficLights;
    private String greenLight;

    public JunctionTrafficController() {
        this.trafficLights = new HashMap<>();
        this.greenLight = "";
    }

    public void registerTrafficLight(String direction, TrafficLight trafficLight) {
        trafficLights.put(direction, trafficLight);
    }

    @Override
    public void requestChangeToGreen(TrafficLight trafficLight, String direction) {
        if (greenLight.isEmpty()) {
            greenLight = direction;
            trafficLight.notifyTrafficControl("Changed to green.");
            System.out.println(direction + " Traffic Light is now green.");
        } else if (greenLight.equals(direction)) {
            trafficLight.notifyTrafficControl("Already green.");
        } else {
            trafficLight.notifyTrafficControl("Cannot change to green. " + greenLight + " is already green.");
        }
    }

    @Override
    public void requestChangeToRed(TrafficLight trafficLight, String direction) {
        if (greenLight.equals(direction)) {
            greenLight = "";
            trafficLight.notifyTrafficControl("Changed to red.");
            System.out.println(direction + " Traffic Light is now red.");
        } else {
            trafficLight.notifyTrafficControl(direction + " Traffic Light is not green.");
        }
    }
}
