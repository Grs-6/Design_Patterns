public class Main {
    public static void main(String[] args) {

        JunctionTrafficController controller = new JunctionTrafficController();

        TrafficLight northLight = new NorthTrafficLight(controller);
        TrafficLight southLight = new SouthTrafficLight(controller);
        TrafficLight eastLight = new EastTrafficLight(controller);
        TrafficLight westLight = new WestTrafficLight(controller);

        controller.registerTrafficLight("North", northLight);
        controller.registerTrafficLight("South", southLight);
        controller.registerTrafficLight("East", eastLight);
        controller.registerTrafficLight("West", westLight);

        northLight.changeToGreen(); 
        southLight.changeToGreen(); 
        
        northLight.changeToRed();
        eastLight.changeToGreen(); 

        westLight.changeToGreen(); 
        eastLight.changeToRed();
    }
}
